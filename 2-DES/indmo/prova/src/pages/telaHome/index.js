import { StatusBar } from 'expo-status-bar';
import { Button, Image, SafeAreaView, ScrollView, StyleSheet, Text, TouchableOpacity, View } from 'react-native';
import { TextInput } from 'react-native-web';
import { useState } from 'react';

export default function telaHome({ navigation }) {

    const img = require("../../../assets/vacinacao.png")
    const img2 = require("../../../assets/arquivo.png")

    return (
        <View style={styles.v}>

            <TouchableOpacity style={styles.btn} onPress={() => { navigation.navigate("Historico") }}>
                <Image
                    style={styles.Logo}
                    source={img2} />

                <Text style={styles.texto}>
                    Histórico de Vascinas
                </Text>
            </TouchableOpacity>

            <TouchableOpacity style={styles.btn} onPress={() => { navigation.navigate("Registro") }}>
                <Image
                    style={styles.Logo}
                    source={img} />

                <Text style={styles.texto}>
                    Registrar Vacina
                </Text>
            </TouchableOpacity>

        </View>
    )
}

const styles = StyleSheet.create({
    v: {
        height: "100vh",
        display: "flex",
        justifyContent: "center",
        flexDirection: "row",
        backgroundColor: "#505050"
    },
    Logo: {
        width: 60,
        height: 60,
    },
    btn: {
        height: 150,
        width: 150,
        margin: 10,
        marginTop: 30,
        backgroundColor: "#efefef",
        borderRadius: 20,
        shadowColor: "#000",
        shadowOffset: {
            width: 0,
            height: 12,
        },
        shadowOpacity: 0.58,
        shadowRadius: 16.00,
        elevation: 24,
        display: "flex",
        justifyContent: "space-around",
        alignItems: "center",
        flexDirection: "column",
        paddingTop: 5,
        paddingBottom: 5,
    },
    texto: {
        color:  "#7242F5",
        fontSize: 14,
        fontWeight: "bold"
    }
});