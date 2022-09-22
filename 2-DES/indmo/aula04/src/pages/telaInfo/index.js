import { StatusBar } from 'expo-status-bar';
import { Button, Image, SafeAreaView, ScrollView, StyleSheet, Text, TouchableOpacity, View } from 'react-native';
import { TextInput } from 'react-native-web';
import { useState } from 'react';

export default function telaInfo({ route , navigation}) {
    var { descricao } = route.params
    navigation.setOptions({"title": descricao.nomeRes})
    return (
        <View style={styles.v}>
            <StatusBar barStyle='light-content' backgroundColor='#0000ff'/>
            <View style={styles.v2}>
                <Image
                    style={styles.tinyLogo}
                    source={{
                        uri: descricao.img,
                    }}
                />
                <View style={styles.infoT}>
                    <Text style={styles.info}> {descricao.end} </Text>
                    <Text style={styles.info}> {descricao.telefone} </Text>
                </View>
            </View>
        </View>
    )
}

const styles = StyleSheet.create({
    v: {
        height: "100%",
        display: "flex",
        flexDirection: "column",
        justifyContent: "flex-start",
        alignItems: "center",
        paddingTop: 80,
        backgroundColor: "#777777"
    },
    v2: {
        height: "50%",
        width: "60%",
        borderWidth: 5,
        borderColor: "#fff",
        display: "flex",
        flexDirection: "column",
        justifyContent: "center",
        alignItems: "center",
        borderRadius: 20,
        shadowColor: "#000",
        shadowOffset: {
            width: 10,
            height: 10,
        },
        shadowOpacity: 1.0,
        shadowRadius: 8.30,

        elevation: 13,
    },
    tinyLogo: {
        width: 200,
        height: 200,
        borderRadius: "100%"
    },
    infoT: {
        width: 200,
        height: 100,
        display: "flex",
        justifyContent: "center",
        alignItems: "center"
    },
    info: {
        height: 20,
        width: 160,
        display: "flex",
        alignItems: "center",
        margin: 5
    }
});