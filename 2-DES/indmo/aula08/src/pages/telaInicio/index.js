import { StatusBar } from 'expo-status-bar';
import { Button, Image, StyleSheet, Text, TextInput, Touchable, TouchableOpacity, View } from 'react-native';
import { useState } from 'react';

import AsyncStorage from '@react-native-async-storage/async-storage';

export default function Pergunta01({ navigation }) {


    // var cart = []

    // function saveData(e) {
    //     cart.push(e)
    //     console.log(cart)
    // }

    // function saveData() {

    //     cart.push({
    //       pizza
    //   })

    //     AsyncStorage.setItem('pizza', JSON.stringify(cart));
    //   }



    // const ler = async () => {
    //   try {
    //     const data = await AsyncStorage.getItem('data')
    //     console.log(data)
    //     var d = data != null ? JSON.parse(data) : null
    //     setLida(
    //       <View>
    //         <Text>{d.info1}</Text>
    //         <Text>{d.info2}</Text>
    //         <Text>{d.info3}</Text>
    //       </View>
    //     )
    //   } catch(err) {
    //     console.log(err)
    //   }
    // }

    return (
        <View style={styles.container}>

            <View>
                <Text style={styles.titulo}>Quiz de Comida</Text>
            </View>

            <TouchableOpacity style={styles.continuar} onPress={() => { navigation.navigate("Pergunta01") }}><Text>Começar</Text></TouchableOpacity>

        </View>
    );
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        display: "flex",
        flexDirection: "column",
        alignItems: "center",
        justifyContent: 'center',
        padding: 20,
        backgroundColor: "#f7e8d0"
    },
    titulo: {
        fontSize: "23pt",
        margin: '60px',
        fontWeight: "bolder"
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