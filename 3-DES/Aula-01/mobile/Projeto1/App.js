import * as React from 'react';
import { NavigationContainer } from '@react-navigation/native';
import { createNativeStackNavigator } from '@react-navigation/native-stack';

import telaLogin from './pages/login'

import telaEntregas from './pages/entregas'

const Stack = createNativeStackNavigator();

export default function App() {
  return (
    <NavigationContainer independent={true}>
      <Stack.Navigator>
        <Stack.Screen name="Login" component={telaLogin} options={{ headerShown: false }}/>
        <Stack.Screen name="Entregas" component={telaEntregas} options={{ headerShown: false }}/>
      </Stack.Navigator>
    </NavigationContainer>
  );
}