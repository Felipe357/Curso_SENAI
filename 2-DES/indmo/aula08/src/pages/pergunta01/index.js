import { StatusBar } from 'expo-status-bar';
import { Button, Image, StyleSheet, Text, TextInput, Touchable, TouchableOpacity, View } from 'react-native';
import { useState } from 'react';
import { RadioButton } from 'react-native-paper';
import * as React from 'react';

import AsyncStorage from '@react-native-async-storage/async-storage';

export default function Pergunta01({ navigation }) {
    const [value, setValue] = React.useState('');
    
    var resp = []

    function saveData() {
        resp .push(value)
        AsyncStorage.setItem('Pergunta', JSON.stringify(resp));
    }

    return (
        <View style={styles.container}>

            <View>
                <Text style={styles.titulo}>Quiz de Comida</Text>
            </View>

            <View>
                <Text style={styles.pergunta}>Qual a cor de uma azeitona?</Text>
                <View>
                    <RadioButton.Group onValueChange={value => setValue(value)} value={value}>
                        <RadioButton.Item label="Preta" value="F" />
                        <RadioButton.Item label="Verde" value="E" />
                    </RadioButton.Group>
                </View>
            </View>

            <TouchableOpacity style={styles.continuar} onPress={() => { navigation.navigate("Pergunta02"); saveData() }}><Text>Próximo</Text></TouchableOpacity>

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