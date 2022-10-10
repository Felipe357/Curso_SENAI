import * as React from 'react';
import { NavigationContainer } from '@react-navigation/native';
import { createNativeStackNavigator } from '@react-navigation/native-stack';

import telaPizza from './src/pages/telaPizza/index';
import telaCarrinho from './src/pages/telaCarrinho'


const Stack = createNativeStackNavigator();

export default function App() {
  return (
    <NavigationContainer>
      <Stack.Navigator>
        <Stack.Screen name="Pizzas" component={telaPizza} />
        <Stack.Screen name="Carrinho" component={telaCarrinho} />
      </Stack.Navigator>
    </NavigationContainer>
  );
}