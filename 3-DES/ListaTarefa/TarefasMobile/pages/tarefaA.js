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
            body: '{"status":1}'
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

    const cancelar = (e) => {
        console.log(e)
        const date = new Date();
        var time

        if (date.getHours() < 10) {
            time = '0' + date.getHours() + ":" + date.getMinutes()
        } else {
            time = date.getHours() + ":" + date.getMinutes()
        }

        var alt = {
            "id": e,
            "fim": time,
            "status": 3
        }

        const options = {
            method: 'PUT',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify(alt)
        };

        fetch('http://localhost:5000/altTarefa', options)
            .then(response => response.json())
            .then(response => {
                if (response !== undefined) {
                    window.location.reload()
                }
            })
    }

    const concluir = (e) => {
        console.log(e)
        const date = new Date();
        var time

        if (date.getHours() < 10) {
            time = '0' + date.getHours() + ":" + date.getMinutes()
        } else {
            time = date.getHours() + ":" + date.getMinutes()
        }

        var alt = {
            "id": e,
            "fim": time,
            "status": 2
        }

        const options = {
            method: 'PUT',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify(alt)
        };

        fetch('http://localhost:5000/altTarefa', options)
            .then(response => response.json())
            .then(response => {
                if (response !== undefined) {
                    window.location.reload()
                }
            })
    }


    return (
        <View style={styles.v}>

            <ScrollView style={styles.sv}>
                {
                    tarefa.map((e, index) => {
                        return (
                            <View style={styles.pedido} key={index}>
                                <View style={styles.pedidoL}>
                                    <Text style={styles.info}>Descrição: <Text style={styles.infoP}>{e.descricao}</Text></Text>
                                    <Text style={styles.info}>Início: <Text style={styles.infoP}>{e.horarioInicio}</Text></Text>
                                </View>
                                <View style={styles.btns}>
                                    <TouchableOpacity style={styles.btn2} onPress={() => cancelar(e.id)}><Text style={styles.x}>X</Text></TouchableOpacity>
                                    <TouchableOpacity style={styles.btn} onPress={() => concluir(e.id)}><Text style={styles.te}>Finalizar</Text></TouchableOpacity>
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
    btns: {
        height: "100%",
        display: "flex",
        flexDirection: "column",
        alignItems: "flex-end",
        justifyContent: "space-between",
        paddingBottom: "20px",
        paddingTop: "20px"
    },
    btn: {
        height: 80,
        width: 80,
        backgroundColor: "#65bef7",
        display: "flex",
        justifyContent: "center",
        alignItems: "center",
        borderRadius: "10px"
    },
    x: {
        fontWeight: "900",
        fontSize: "15pt"
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
        maxWidth: "78%",
        display: "flex",
        flexDirection: "column",
        justifyContent: "space-between",
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