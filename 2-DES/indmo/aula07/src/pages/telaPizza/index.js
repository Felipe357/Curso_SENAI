import { StatusBar } from 'expo-status-bar';
import { Button, Image, StyleSheet, Text, TextInput, Touchable, TouchableOpacity, View } from 'react-native';
import { useState } from 'react';

import AsyncStorage from '@react-native-async-storage/async-storage';

import PizzaComp from '../../components/pizzaComp'

export default function Pizzas({ navigation }) {


    var cart = []

    function saveData(e) {
        cart.push(e)
        console.log(cart)
    }

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

    const pizzas = [
        {
            id: 1,
            nome: "Calabresa",
            desc: "Mussarela e Calabresa",
            img: "https://t2.rg.ltmcdn.com/pt/posts/9/8/3/pizza_calabresa_e_mussarela_4389_600.jpg"
        },
        {
            id: 2,
            nome: "Holandesa",
            desc: "Mussarela, atum, requeijão e cebola",
            img: "https://t2.rg.ltmcdn.com/pt/posts/9/8/3/pizza_calabresa_e_mussarela_4389_600.jpg"
        },
        {
            id: 3,
            nome: "Italiana",
            desc: "Mussarela, salame italiano",
            img: "https://t2.rg.ltmcdn.com/pt/posts/9/8/3/pizza_calabresa_e_mussarela_4389_600.jpg"
        },
        {
            id: 4,
            nome: "Bolonhesa",
            desc: "Mussarela e carne moída à bolonhesa",
            img: "https://t2.rg.ltmcdn.com/pt/posts/9/8/3/pizza_calabresa_e_mussarela_4389_600.jpg"
        },
        {
            id: 5,
            nome: "Camponesa",
            desc: "Mussarela, bacon, tomate, milho e ovos",
            img: "https://t2.rg.ltmcdn.com/pt/posts/9/8/3/pizza_calabresa_e_mussarela_4389_600.jpg"
        },
        {
            id: 6,
            nome: "Brócolis c/ bacon",
            desc: "Mussarela, brócolis e bacon",
            img: "https://t2.rg.ltmcdn.com/pt/posts/9/8/3/pizza_calabresa_e_mussarela_4389_600.jpg"
        },
        {
            id: 7,
            nome: "Canadense",
            desc: "Mussarela, lombo e champignon",
            img: "https://t2.rg.ltmcdn.com/pt/posts/9/8/3/pizza_calabresa_e_mussarela_4389_600.jpg"

        },
    ]







    // const salvar = async () => {
    //     try {
    //         const v = JSON.stringify({  })
    //         await AsyncStorage.setItem('pizza', v)
    //     } catch (err) {
    //         console.log(err)
    //     }
    // }




    return (
        <View style={styles.container}>

            {
                pizzas.map((pi, indice) => {
                    return (
                        <View>
                            <PizzaComp
                                key={indice}
                                pizza={pi} 
                                onClick={() => saveData(pi)}>
                                
                            </PizzaComp>

                        </View>

                    )
                })
            }

            <TouchableOpacity style={styles.car} onPress={() => { navigation.navigate("Carrinho") }}>Carrinho</TouchableOpacity>

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
