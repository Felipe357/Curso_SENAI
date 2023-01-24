import { useEffect, useState } from 'react';
import { StyleSheet, Text, TextInput, View, Image } from 'react-native';
import { NavigationContainer } from '@react-navigation/native';

import { createMaterialBottomTabNavigator } from '@react-navigation/material-bottom-tabs';
import { MaterialCommunityIcons } from '@expo/vector-icons';

import poke from './poke'
import poke2 from './poke2'

const Tab = createMaterialBottomTabNavigator();

function MyTabs() {
  return (
    <Tab.Navigator
      initialRouteName="Feed"
      activeColor="#1a4566"
      inactiveColor="#wff030"
      barLabelStyle={{ color: '#FFF' }}
      barStyle={{ backgroundColor: "#1a4566" }}
    >
      <Tab.Screen
        name="Feed"
        component={poke}
        options={{
          tabBarLabel: 'Home',
          tabBarIcon: ({ color }) => (
            <MaterialCommunityIcons name="home" color={color} size={26} />
          ),
        }}
      />
      <Tab.Screen
        name="Notifications"
        component={poke2}
        options={{
          tabBarLabel: 'Postagens',
          tabBarIcon: ({ color }) => (
            <MaterialCommunityIcons name="forum" color={color} size={26} />
          ),
        }}
      />
    </Tab.Navigator>
  );
}

export default function App() {

    <NavigationContainer>
      <MyTabs />
    </NavigationContainer>
  

  // const [poke, setPoke] = useState()
  // const [img, setImg] = useState("")
  // const [type, setType] = useState([])
  // const [nome, setNome] = useState("")


  // useEffect(() => {
  //   fetch("https://pokeapi.co/api/v2/pokemon/" + poke)
  //     .then(res => { return res.json() })
  //     .then(data => {
  //       setNome(data.name)
  //       setImg(data.sprites.front_default)
  //       setType(data.types)
  //     })
  // }, [poke])



  // return (
  //   <View style={styles.container}>
  //     <TextInput style={styles.inp} title="Nome do Pokemon" onChangeText={(val) => { setPoke(val) }} />
  //     {

  //       <View style={styles.poke}>
  //         <Text>{nome}</Text>
  //         <Image
  //           style={styles.tinyLogo}
  //           source={{
  //             uri: img
  //           }}
  //         />
  //         {
  //           type.map((e) => {
  //             return (
  //               <Text>{e.type.name}</Text>
  //             )
  //           })
  //         }
  //       </View>

  //     }
  //   </View>
  // )
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
  tinyLogo: {
    resizeMode: 'contain',
    width: 200,
    height: 200,
  },
  inp: {
    height: 30,
    width: 120,
    borderColor: "#000",
    borderBottomWidth: 3,
    marginBottom: 10
  },
  poke: {
    height: 400,
    width: 300,
    backgroundColor: "#ececec",
    display: "flex",
    flexDirection: "column",
    justifyContent: "space-around",
    alignItems: 'center',
    shadowColor: "#000",
    shadowOffset: {
      width: 0,
      height: 8,
    },
    shadowOpacity: 0.46,
    shadowRadius: 11.14,

    elevation: 17,
  }
});