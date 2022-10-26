import { StatusBar } from 'expo-status-bar';
import { Button, Image, StyleSheet, Text, TextInput, Touchable, TouchableOpacity, View } from 'react-native';


export default function Inicio({ navigation }) {


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