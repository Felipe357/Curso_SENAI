import { StatusBar } from 'expo-status-bar';
import { Button, Image, SafeAreaView, ScrollView, StyleSheet, Text, TouchableOpacity, View } from 'react-native';
import { TextInput } from 'react-native-web';
import { useState, useEffect, useMemo } from 'react';

import AsyncStorage from '@react-native-async-storage/async-storage';

export default function telaHome({ }) {

    const [idEntregador, setEntregador] = useState("")

    const [entre, setEntre] = useState([])


    const getData = async () => {
        try {
            const value = await AsyncStorage.getItem('Info')
            if (value !== null) {
                setEntregador(value)
            }
        } catch (e) {
            // error reading value
        }
    }

    function carregar() {
        if (idEntregador[1] >= 1) {
            const options = { method: 'GET' };

            fetch('http://localhost:5000/buscarEntregador/' + idEntregador[1], options)
                .then(response => response.json())
                .then(resp => {
                    console.log("kg")
                    setEntre(resp)
                })
        } else {
            console.log("opaaa")
        }
    }

    getData()

    useEffect(() => {
        carregar()
    }, [idEntregador])

    const enviar = (e) => {
        const date = new Date();
        var time

        if (date.getHours() < 10) {
            time = '0' + date.getHours() + ":" + date.getMinutes()
        } else {
            time = date.getHours() + ":" + date.getMinutes()
        }

        var alt = {
            "id_pedido": e,
            "hora_fim": time
        }

        const options = {
            method: 'PUT',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify(alt)
        };

        fetch('http://localhost:5000/altPedidoFim', options)
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
                    entre.map((e, index) => {
                        console.log(e)

                        if (e.hora_fim === "" && e.hora_entrega !== "") {
                            return (

                                <View style={styles.pedido}>
                                    <View style={styles.pedidoL}>
                                        <Text style={styles.info}>ID: <Text style={styles.infoP}>{e.id_pedido}</Text></Text>
                                        <Text style={styles.info}>Cliente: <Text style={styles.infoP}>{e.cliente}</Text></Text>
                                        <Text style={styles.info}>Endereço: <Text style={styles.infoP}>{e.endereco}</Text></Text>
                                        <Text style={styles.info}>Horario: <Text style={styles.infoP}>{e.hora_pedido}</Text></Text>
                                        <Text style={styles.info}>Produto: <Text style={styles.infoP}>{e.produto}</Text></Text>
                                        <Text style={styles.info}>Data: <Text style={styles.infoP}>{e.data}</Text></Text>
                                        <Text style={styles.info}>Entrega: <Text style={styles.infoP}>{e.hora_entrega}</Text></Text>
                                    </View>
                                    <TouchableOpacity style={styles.btn} onPress={() => enviar(e.id_pedido)}><Text style={styles.te}>Enviar</Text></TouchableOpacity>
                                </View>

                            )
                        }


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
        backgroundColor: "#505050",
        width: "100%",
        flex: 1,
        padding: 20
    },
    sv: {
        height: "100%",
        backgroundColor: "#505050",
        width: "100%",
    },
    btn: {
        height: 80,
        width: 80,
        backgroundColor: "#88eed0",
        display: "flex",
        justifyContent: "center",
        alignItems: "center",
        borderColor: "Black",
        borderWidth: "1px",
        borderRadius: "10px"
    },
    te: {
        fontSize: "10pt"
    },
    pedido: {
        width: "100%",
        height: "200px",
        backgroundColor: "#42adf5",
        display: "flex",
        justifyContent: "space-between",
        flexDirection: "row",
        padding: "20px",
        alignItems: "center",
        borderRadius: "10px",
        marginBottom: "30px"
    },
    pedidoL: {
        maxWidth: "78%"
    },
    info: {
        fontSize: "13pt",
        fontWeight: "bold",
        color: "#fff"
    },
    infoP: {
        fontSize: "11pt",
        fontWeight: "normal",
        color: "#000"
    }

});