import { StatusBar } from 'expo-status-bar';
import { Button, Image, SafeAreaView, ScrollView, StyleSheet, Text, TouchableOpacity, View } from 'react-native';
import { TextInput } from 'react-native-web';
import { useState, useEffect, useMemo } from 'react';

export default function telaHome({ }) {

    const [descricao, setDescricao] = useState("")

    const cad = () => {

        if (descricao.length < 5) {
            window.alert("Ai tá de brincadeira né meu")
        } else {
            const date = new Date();
            var time

            if (date.getHours() < 10) {
                time = '0' + date.getHours() + ":" + date.getMinutes()
            } else {
                time = date.getHours() + ":" + date.getMinutes()
            }

            var alt = {
                "descricao": descricao,
                "horarioInicio": time,
                "horarioFim": "",
                "status": 1
            }
            console.log(alt)
            const options = {
                method: 'POST',
                headers: { 'Content-Type': 'application/json' },
                body: JSON.stringify(alt)
            };

            fetch('http://localhost:5000/cadTarefa', options)
                .then(response => response.json())
                .then(response => {
                    if (response !== undefined) {
                        window.location.reload()
                    }
                })
        }
    }

    return (
        <View style={styles.v}>

            <View style={styles.cad}>
                <TextInput multiline numberOfLines={5} maxLenght={300} onChangeText={(des) => { setDescricao(des) }} style={styles.inp}/>
                <TouchableOpacity styles={styles.btnCad} onPress={() => cad()}><Text style={styles.btn}>Cadastrar</Text></TouchableOpacity>
            </View>

        </View>
    )
}

const styles = StyleSheet.create({
    v: {
        display: "flex",
        alignItems: "center",
        justifyContent: "center",
        flexDirection: "column",
        backgroundColor: "#fefefe",
        width: "100%",
        flex: 1,
        padding: 20
    },
    cad: {
        height: "250px",
        width: "90%",
        backgroundColor: "#d1d8e3",
        borderRadius: "10px",
        display: "flex",
        justifyContent: "space-between",
        flexDirection: "column",
        alignItems: "center",
        padding: "20px"
    },
    inp: {
        backgroundColor: "#a8b0bd",
        width: "95%",
        height: "75%",
    },
    btnCad: {
        height: "10%",
        width: "30%",
        backgroundColor: "#34eb5e"
    },

});