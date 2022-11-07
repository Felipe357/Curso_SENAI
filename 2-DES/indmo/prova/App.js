import * as React from 'react';
import { NavigationContainer } from '@react-navigation/native';
import { createNativeStackNavigator } from '@react-navigation/native-stack';

import telaLogin from './src/pages/telaLogin/index'
import telaHome from './src/pages/telaHome/index'
import telaRegistro from './src/pages/telaRegistro/index'
import telaHistorico from './src/pages/telaHistorico/index'


const Stack = createNativeStackNavigator();

export default function App() {
  return (
    <NavigationContainer>
      <Stack.Navigator>
        <Stack.Screen name="Login" component={telaLogin} />
        <Stack.Screen name="Home" component={telaHome} />
        <Stack.Screen name="Registro" component={telaRegistro} />
        <Stack.Screen name="Historico" component={telaHistorico} />
      </Stack.Navigator>
    </NavigationContainer>
  );
}