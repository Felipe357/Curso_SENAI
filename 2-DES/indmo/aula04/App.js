import * as React from 'react';
import { NavigationContainer } from '@react-navigation/native';
import { createNativeStackNavigator } from '@react-navigation/native-stack';

import telaRestaurante from './src/pages/telaRestaurante/index.js';
import telaInfo from './src/pages/telaInfo/index.js';

const Stack = createNativeStackNavigator();

export default function App() {
  return (
    <NavigationContainer>
      <Stack.Navigator>
        <Stack.Screen name="Restaurante" component={telaRestaurante} />
        <Stack.Screen style name="telaInfo" component={telaInfo} />
      </Stack.Navigator>
    </NavigationContainer>
  );
}