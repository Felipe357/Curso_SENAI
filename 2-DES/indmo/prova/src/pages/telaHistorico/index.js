import { StatusBar } from 'expo-status-bar';
import { Button, Image, SafeAreaView, ScrollView, StyleSheet, Text, TouchableOpacity, View } from 'react-native';
import { TextInput } from 'react-native-web';
import { useState, useEffect, useMemo } from 'react';

import AsyncStorage from '@react-native-async-storage/async-storage';

export default function telaHome({ navigation }) {

    const [busca, setBusca] = useState("")
    const [funciona, setFunciona] = useState([])


    var resp

    const ler = async () => {
        try {
            const data = await AsyncStorage.getItem('Historico')
            var d = data != null ? JSON.parse(data) : null
            resp = d

            carregar()

        } catch (err) {
            console.log(err)
        }
    }

    function carregar() {
        
        setFunciona(resp)
    }
    
    const filtro = useMemo(() => {
        const lowerBusca = busca.toLowerCase()
        
        
            return funciona.filter((chamado) =>
            chamado.toLowerCase().startsWith(lowerBusca)
        )
        
    }, [busca])

    useEffect(() => {
        ler()
    }, [])

    return (
        <View style={styles.v}>

            <TextInput
                style={styles.p}
                placeholder="Digite para buscar"
                // autoCapitalize="none"
                // autoCorrect={false}
                // clearButtonMode="always"
                // onChangeText={(val) => setBusca(val)}
            />

            {
                funciona.map((v, indice) => {

        
                    return (
                        <View style={styles.info} key={indice}>
                            <Text style={styles.txt}>PET: {v.pet}</Text>
                            <Text style={styles.txt}>Veterinário: {v.vet}</Text>
                            <Text style={styles.txt}>Vacina: {v.vas}</Text>
                            <Text style={styles.txt}>Data: {v.date}</Text>
                        </View>
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
        alignItems: "center",
        flexDirection: "column",
        backgroundColor: "#505050"
    },
    info: {
        backgroundColor: "#919191",
        height: 130,
        width: 300,
        marginTop: 10,
        padding: 10,
        borderRadius: 10,
        shadowColor: "#000",
        shadowOffset: {
            width: 0,
            height: 12,
        },
        shadowOpacity: 0.58,
        shadowRadius: 16.00,
    },
    txt: {
        color: "#fff",
        fontSize: "13pt",
        fontWeight: "bold"
    },
    p: {
        width: 300,
        height: 50,
        backgroundColor: "#fff",
        borderRadius: 4,
        padding: 10,
        margin: 20
    }
});