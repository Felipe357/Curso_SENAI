import { StatusBar } from 'expo-status-bar';
import { Button, Image, SafeAreaView, ScrollView, StyleSheet, Text, TouchableOpacity, View } from 'react-native';
import { TextInput } from 'react-native-web';
import { useState } from 'react';

import AsyncStorage from '@react-native-async-storage/async-storage';

export default function telaHome({ navigation }) {
    const [text1, setText1] = useState('');
    const [text2, setText2] = useState('');
    const [text3, setText3] = useState('');
    const [text4, setText4] = useState('');

    var resp
    const ler = async () => {
        try {
            const data = await AsyncStorage.getItem('Historico')
            console.log(data)
            var d = data != null ? JSON.parse(data) : null
            resp = d

            const value = {
                pet: text1,
                vet: text2,
                vas: text3,
                date: text4
            }

            resp.push(value)
            console.log(resp)
            AsyncStorage.setItem('Historico', JSON.stringify(resp));
        } catch (err) {
            console.log(err)
        }
    }

    return (
        <View style={styles.v}>

            <TextInput placeholder="Nome do pet" style={styles.imp} onChangeText={Text => setText1(Text)}></TextInput>
            <TextInput placeholder="Nome do médico veterinário" style={styles.imp} onChangeText={Text => setText2(Text)}></TextInput>
            <TextInput placeholder="Nome da vacina" style={styles.imp} onChangeText={Text => setText3(Text)}></TextInput>
            <TextInput placeholder="Data da aplicacao" style={styles.imp} onChangeText={Text => setText4(Text)}></TextInput>

            <TouchableOpacity style={styles.btn} onPress={() => { navigation.navigate("Home"); ler() }}><Text style={styles.txt}>Registrar</Text></TouchableOpacity>

        </View>
    )
}

const styles = StyleSheet.create({
    v: {
        height: "100vh",
        display: "flex",
        alignItems: "center",
        flexDirection: "column",
        backgroundColor: "#505050"
    },
    imp: {
        height: 50,
        width: 250,
        backgroundColor: "#efefef",
        marginTop: 20,
        borderRadius: 10,
        padding: 20,
        color: "#b8b4b4"
    },
    btn: {
        height: 60,
        width: 250,
        backgroundColor: "#7242F5",
        marginTop: 20,
        display: "flex",
        justifyContent: "center",
        alignItems: "center",
        borderRadius: 10
    },
    txt: {
        color: "#fff",
        fontSize: "15pt",
        fontWeight: "bold"
    }
});