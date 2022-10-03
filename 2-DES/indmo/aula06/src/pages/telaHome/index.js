import { StatusBar } from 'expo-status-bar';
import { Button, Image, SafeAreaView, ScrollView, StyleSheet, Text, TouchableOpacity, View } from 'react-native';
import { TextInput } from 'react-native-web';
import { useMemo, useState } from 'react';

import Chamado from '../../comps/itenHome';

const chamados = [
    {
        "user_id": 1,
        "chamados": [
            {
                "titulo": "Manutenção de Roteador",
                "descricao": "Cliente reclamou que está sem internet, possível troca"
            },
            {
                "titulo": "Mudança de Endereço",
                "descricao": "Fazer a instalação na nova instalação"
            },
            {
                "titulo": "Recolher equipamento",
                "descricao": "Assinatura Cancelada, recolher os equipamentos da instalação"
            }
        ]
    },
    {
        "user_id": 2,
        "chamados": [
            {
                "titulo": "Recolher equipamento",
                "descricao": "Assinatura Cancelada, recolher os equipamentos da instalação"
            },
            {
                "titulo": "Mudança de Endereço",
                "descricao": "Fazer a instalação na nova instalação"
            },
            {
                "titulo": "Manutenção de Roteador",
                "descricao": "Cliente reclamou que está sem internet, possível troca"
            }
        ]
    }
]

export default function telaHome({ route }) {
    const user = route.params.id;

    var chamadosUser
    chamados.forEach(c => {
        if (user == c.user_id) {
            chamadosUser = c.chamados
        }
    })

    const [busca, setBusca] = useState("")

    const chamadosFiltrados = useMemo(() => {
        const lowerBusca = busca.toLowerCase();
        return chamadosUser.filter((chamado) =>
            chamado.titulo.toLowerCase().startsWith(lowerBusca)
        );
    }, [busca])



    return (
        <View style={styles.v}>

            <TextInput
                style={styles.p}
                placeholder="Filtrar"
                autoCapitalize="none"
                autoCorrect={false}
                clearButtonMode="always"
                onChangeText={(val) => setBusca(val)}
            />

            {
                chamadosFiltrados.map((c, indice) => {

                    return (
                        <Chamado key={indice} ch={c} />
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
        flexDirection: "column",
        justifyContent: "flex-start",
        alignItems: "center",
        paddingTop: 80,
        backgroundColor: "#efefef"
    },
    p: {
        width: 300,
        height: 30,
        borderBottomWidth: 2,
        borderColor: "#7242F5",
        backgroundColor: "#fff",
        borderRadius: 4,
        padding: 10
    }

});