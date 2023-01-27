import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View } from 'react-native';

import { NavigationContainer } from '@react-navigation/native';
import { createBottomTabNavigator } from '@react-navigation/bottom-tabs';

import tarefa from "./pages/tarefaA"
import tarefaF from "./pages/tarefaF"
import tarefaC from "./pages/tarefaC"
import cad from "./pages/Cadastrar"

const Tab = createBottomTabNavigator();

export default function App() {
  return (
    <NavigationContainer>
      <Tab.Navigator>
        <Tab.Screen name="Em Aberto" component={tarefa} />
        <Tab.Screen name="Finalizadas" component={tarefaF} />
        <Tab.Screen name="Canceladas" component={tarefaC} />
        <Tab.Screen name="Cadastrar" component={cad} />
      </Tab.Navigator>
    </NavigationContainer>
  );
}