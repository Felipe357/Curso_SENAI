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
                "img": "https://img.freepik.com/premium-vector/chef-restaurant-logo-inspiration_139869-449.jpg?w=2000",
                "end": "Santo Antônio de Posse",
                "telefone": "19989030956"
            }
        },
        {
            "nomeRes": "Premium",
            "avaliacao": 4.4,
            "descricao": {
                "img": "https://img.freepik.com/premium-vector/restaurant-logo-design-template_79169-56.jpg?w=2000",
                "end": "Pedreira",
                "telefone": "19995778086"
            }
        },
        {
            "nomeRes": "Drinks BG",
            "avaliacao": 3.9,
            "descricao": {
                "img": "https://media.istockphoto.com/vectors/restaurant-food-drinks-logo-fork-knife-background-vector-image-vector-id981368726?k=20&m=981368726&s=612x612&w=0&h=Um4YOExWlUgOfpUs2spnN0NrrXs-M71OUuUMbStVFNQ=",
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
                        <TouchableOpacity style={styles.infoRes} key={indice} onPress={() => { navigation.navigate("telaInfo", { "descricao": produto.descricao }) }}>
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
        backgroundColor: "#87cefa"
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