import { Text, View, Image } from 'react-native';
import { TouchableOpacity } from 'react-native-web';

import AsyncStorage from '@react-native-async-storage/async-storage';

export default function Chamado(props) {
    const { pizza } = props;

    console.log(pizza)

    function saveData() {

        let obj = {
            nome: pizza.nome,
            desc: pizza.desc,
            img: pizza.img,
        }

        AsyncStorage.setItem('pizza', JSON.stringify(obj));
    }


    return (

        

        <View style={styles.pizza}>

        <View style={styles.pizzaCont}>
          <Image
            style={styles.tinyLogo}
            source={{
              uri: pizza.img,
            }}
          />
  
          <View>
            <Text style={styles.nomePizza}>{pizza.nome}</Text>
            <Text style={styles.desPizza}>{pizza.desc}</Text>
          </View>
        </View>
        <View>
          <TouchableOpacity style={styles.btn}><Image
            style={styles.tinyLogo2}
            source={{
              uri: 'https://cdn3.iconfinder.com/data/icons/eightyshades/512/14_Add-512.png',
            }}
            onClick={() => {saveData()}}
          /></TouchableOpacity>
        </View>
      </View>
            
    )
}

import { StyleSheet } from 'react-native';

const styles = StyleSheet.create({
    pizza: {
      display: "flex",
      backgroundColor: '#fff',
      alignItems: 'center',
      flexDirection: "row",
      justifyContent: "space-between",
      
      width: "80vw",
      margin: 20,
      borderRadius: 10
    },
    pizzaCont: {
      display: "flex",
      alignItems: "center",
      flexDirection: "row",
    },
    nomePizza: {
      fontWeight: "bold",
      fontSize: 15,
      margin: 4
    },
    desPizza: {
      fontSize: 13,
      maxWidth: 130
    },
    tinyLogo: {
      width: 45,
      height: 45,
      marginRight: 20,
      marginLeft: 5,
      borderRadius: 50,
      margin: 10
    },
    tinyLogo2: {
        width: 40,
        height: 40,
        marginRight: 20
      },
    btn: {
      fontSize: 25,
      fontWeight: "bold",
      marginRight: 1
    }
  });