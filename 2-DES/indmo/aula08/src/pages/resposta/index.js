import { StatusBar } from 'expo-status-bar';
import { Button, Image, StyleSheet, Text, TextInput, Touchable, TouchableOpacity, View } from 'react-native';
import { useState, useEffect } from 'react';
import { RadioButton } from 'react-native-paper';
import * as React from 'react';

import AsyncStorage from '@react-native-async-storage/async-storage';

export default function Resposta({ navigation }) {

    const [onLoadText, setText] = useState("");

    var resp
    var re = []
    const ler = async () => {
        try {
            const data = await AsyncStorage.getItem('Pergunta')
            var d = data != null ? JSON.parse(data) : null
            resp = d

            resp.forEach(r => {
                if (r == "E") {
                    re.push(r)
                    setText(re.length)
                }
            })
        } catch (err) {
            console.log(err)
        }
    }

    useEffect(() => {
        ler()
    },[])

    return (
        <View style={styles.container}>

            <View>
                <Text style={styles.titulo}>Quiz de Comida</Text>
            </View>

            <View>
                <Text style={styles.pergunta}>Parabéns</Text>
                <View>
                    <Text>Você acertou {onLoadText}</Text>
                </View>
            </View>

            <TouchableOpacity style={styles.continuar} onPress={() => { 
                
                 navigation.navigate("Quiz")
                }}><Text>Começar</Text></TouchableOpacity>
            
        </View>
    );
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        display: "flex",
        flexDirection: "column",
        alignItems: "center",
        justifyContent: 'space-around',
        padding: 20,
        backgroundColor: "#f7e8d0"
    },
    titulo: {
        fontSize: "23pt",
        margin: '60px',
        fontWeight: "bolder"
    },
    pergunta: {
        fontSize: '15pt'
    },
    continuar: {
        backgroundColor: "#faad39",
        width: '150px',
        height: '50px',
        display: "flex",
        alignItems: "center",
        justifyContent: 'center',
        borderWidth: '1px',
        borderColor: '#000000',
        borderRadius: '10px',
        margin: '60px',
    }
});