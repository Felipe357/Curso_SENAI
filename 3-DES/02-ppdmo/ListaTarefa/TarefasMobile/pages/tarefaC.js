import { StatusBar } from 'expo-status-bar';
import { Button, Image, SafeAreaView, ScrollView, StyleSheet, Text, TouchableOpacity, View } from 'react-native';
import { TextInput } from 'react-native-web';
import { useState, useEffect, useMemo } from 'react';

export default function telaHome({ }) {

    const [tarefa, setTarefa] = useState([])

    function carregar() {

        const options = {
            method: 'POST',
            headers: { 'Content-Type': 'application/json' },
            body: '{"status":3}'
        };

        fetch('http://localhost:5000/listarStatus', options)
            .then(response => response.json())
            .then(response => {
                setTarefa(response)
            })

    }

    useEffect(() => {
        carregar()
    }, [])


    return (
        <View style={styles.v}>

            <ScrollView style={styles.sv}>
                {
                    tarefa.map((e, index) => {
                        return (
                            <View style={styles.pedido} key={index}>
                                <View style={styles.pedidoL}>
                                    <Text style={styles.info}>Descrição: <Text style={styles.infoP}>{e.descricao}</Text></Text>
                                    <Text style={styles.info}>Fim: <Text style={styles.infoP}>{e.horarioFim}</Text></Text>
                                </View>
                            </View>

                        )
                    })
                }


            </ScrollView>
        </View>
    )
}

const styles = StyleSheet.create({
    v: {
        display: "flex",
        alignItems: "center",
        flexDirection: "column",
        backgroundColor: "#fefefe",
        width: "100%",
        flex: 1,
        padding: 20
    },
    sv: {
        height: "100%",
        backgroundColor: "none",
        width: "100%",
    },
    te: {
        fontSize: "10pt"
    },
    pedido: {
        width: "100%",
        height: "200px",
        backgroundColor: "#addaf7",
        display: "flex",
        justifyContent: "space-between",
        flexDirection: "row",
        paddingLeft: "20px",
        paddingRight: "20px",
        alignItems: "center",
        borderRadius: "10px",
        marginBottom: "30px"
    },
    pedidoL: {
        height: "100%",
        maxWidth: "100%",
        display: "flex",
        flexDirection: "column",
        justifyContent: "space-between",
        alignItems: "flex-start",
        paddingBottom: "20px",
        paddingTop: "20px"
    },
    info: {
        fontSize: "13pt",
        fontWeight: "bold",
        color: "#595959"
    },
    infoP: {
        fontSize: "11pt",
        fontWeight: "normal",
        color: "#7d7d7d"
    }

});