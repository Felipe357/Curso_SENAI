import { StatusBar } from 'expo-status-bar';
import { Button, Image, StyleSheet, Text, TextInput, View } from 'react-native';
import { useState } from 'react';

import AsyncStorage from '@react-native-async-storage/async-storage';




export default function Carrinho({ route }) {




    const ler = async () => {
        try {
            const data = await AsyncStorage.getItem('pizza')
            console.log(data)
            var d = data != null ? JSON.parse(data) : null
            console.log(d)
            return (
                <View>
                    <Text>{d[0].nome}</Text>
                    <Text>{d.desc}</Text>
                    <Text>{d.img}</Text>
                </View>
            )
        } catch (err) {
            console.log(err)
        }
    }



    return (
        <View style={styles.container}>

            <Button title='Ler' onPress={() => { ler() }} />

        </View>
    );
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        padding: 20,
        backgroundColor: "#efefef"
    }
});
