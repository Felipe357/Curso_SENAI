import { StatusBar } from 'expo-status-bar';
import { Button, StyleSheet, Text, TextInput, View } from 'react-native';
import { useState } from 'react';

import AsyncStorage from '@react-native-async-storage/async-storage';

export default function App() {

  const [info1, setInfo1] = useState("")
  const [info2, setInfo2] = useState("")
  const [info3, setInfo3] = useState("")

  const [lida, setLida] = useState("")

  const salvar = async () => {
    try {
      const v = JSON.stringify({info1, info2, info3})
      await AsyncStorage.setItem('data', v)
      setInfo1("")
      setInfo2("")
      setInfo3("")
    } catch (err) {
      console.log(err)
    }
  }

  
const ler = async () => {
  try {
    const data = await AsyncStorage.getItem('data')
    console.log(data)
    var d = data != null ? JSON.parse(data) : null
    setLida(
      <View>
        <Text>{d.info1}</Text>
        <Text>{d.info2}</Text>
        <Text>{d.info3}</Text>
      </View>
    )
  } catch(err) {
    console.log(err)
  }
}


  return (
    <View style={styles.container}>
      <TextInput value={info1} onChangeText={(val) => { setInfo1(val) }} />
      <TextInput value={info2} onChangeText={(val) => { setInfo2(val) }} />
      <TextInput value={info3} onChangeText={(val) => { setInfo3(val) }} />
      <Button title='Salvar' onPress={() => { salvar() }} />
      <Button title='Ler' onPress={() => { ler() }} />
      <View>{lida}</View>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
});
