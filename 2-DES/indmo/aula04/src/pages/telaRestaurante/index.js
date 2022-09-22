import { StatusBar } from 'expo-status-bar';
import { Button, Image, SafeAreaView, ScrollView, StyleSheet, Text, TouchableOpacity, View } from 'react-native';
import { TextInput } from 'react-native-web';
import { useState } from 'react';

export default function telaRestaurante({ navigation }) {

    const produtos = [
        {
            "nomeRes": "Du Chef",
            "avaliacao": 4.3,
            "descricao": {
                "img": "https://scontent-gru1-2.xx.fbcdn.net/v/t1.6435-9/125216467_2690260301303693_4408456013494873207_n.jpg?_nc_cat=108&ccb=1-7&_nc_sid=09cbfe&_nc_ohc=2UHUpW4ltjMAX91QljI&_nc_ht=scontent-gru1-2.xx&oh=00_AT9Dj0QLTZLGOPQ94UnwGkTxLSEfb-j6c7jPNi-ys8Y7YA&oe=6350ABBC",
                "end": "Holambra",
                "telefone": "19989030956"
            }
        },
        {
            "nomeRes": "Carnívoros",
            "avaliacao": 4.4,
            "descricao": {
                "img": "https://files.menudino.com/cardapios/16138/logo.png",
                "end": "Mogi guaçu",
                "telefone": "19995778086"
            }
        },
        {
            "nomeRes": "Na Lenha",
            "avaliacao": 3.9,
            "descricao": {
                "img": "https://scontent-gru2-2.xx.fbcdn.net/v/t39.30808-1/305205704_550856957039456_4143841505908483686_n.jpg?stp=dst-jpg_p200x200&_nc_cat=105&ccb=1-7&_nc_sid=c6021c&_nc_ohc=DVkekAhizeUAX9Bb7VR&_nc_ht=scontent-gru2-2.xx&oh=00_AT8uOHRvwYtkAi_qyeFI17cmI40_5_iAc09_e7W2Nk4VRQ&oe=63323BF7",
                "end": "Jaguariúna",
                "telefone": "19993120806"
            }
        }
    ] 

    return (
        <View style={styles.v}>
            {
                produtos.map((produto, indice) => {
                    return (
                        <TouchableOpacity style={styles.infoRes} key={indice} onPress={() => { navigation.navigate("telaInfo", {"descricao":{  ...produto.descricao, "nomeRes": produto.nomeRes }, }) }}>
                            <Text style={styles.text}>{produto.nomeRes}</Text>
                            <Text style={styles.text}>
                                {produto.avaliacao}
                                <Image
                                    style={styles.tinyLogo}
                                    source={{
                                        uri: "https://cdn-icons-png.flaticon.com/512/616/616489.png",
                                    }}
                                />
                            </Text>
                        </TouchableOpacity>
                    )
                })
            }
        </View>
    )
}

const styles = StyleSheet.create({
    v: {
        height: "100%",
        display: "flex",
        justifyContent: "space-around",
        flexDirection: "column",
        alignItems: "center",
        backgroundColor: "#d0d0d0"
    },
    tinyLogo: {
        width: 15,
        height: 15
    },
    infoRes: {
        height: 60,
        width: 250,
        display: "flex",
        flexDirection: "row",
        justifyContent: "space-around",
        alignItems: "center",
        borderWidth: 2,
        borderRadius: 10,
        borderColor: "#fff"
    },
    text: {
        fontSize: 30
    }
});