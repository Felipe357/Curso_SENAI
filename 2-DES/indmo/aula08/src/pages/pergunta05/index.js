import { StatusBar } from 'expo-status-bar';
import { Button, Image, StyleSheet, Text, TextInput, Touchable, TouchableOpacity, View } from 'react-native';
import { useState } from 'react';
import { RadioButton } from 'react-native-paper';
import * as React from 'react';

import AsyncStorage from '@react-native-async-storage/async-storage';

export default function Pergunta05({ navigation }) {
    const [value, setValue] = React.useState('');
    var resp
    const ler = async () => {
        try {
            const data = await AsyncStorage.getItem('Pergunta')
            console.log(data)
            var d = data != null ? JSON.parse(data) : null
            resp = d
            resp.push(value)
            console.log(resp)
            AsyncStorage.setItem('Pergunta', JSON.stringify(resp));
        } catch (err) {
            console.log(err)
        }
    }

    
    

    return (
        <View style={styles.container}>

            <View>
                <Text style={styles.titulo}>Quiz de Comida</Text>
            </View>

            <View>
                <Text style={styles.pergunta}>Qual o sinônimo de sinônimo?</Text>
                <View>
                    <RadioButton.Group onValueChange={value => setValue(value)} value={value}>
                        <RadioButton.Item label="Sinonímias" value="F" />
                        <RadioButton.Item label="Sinonimias" value="E" />
                    </RadioButton.Group>
                </View>
            </View>

            <TouchableOpacity style={styles.continuar} onPress={() => { navigation.navigate("Resposta"); ler()  }}><Text>Próximo</Text></TouchableOpacity>

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