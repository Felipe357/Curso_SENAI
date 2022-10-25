import * as React from 'react';
import { NavigationContainer } from '@react-navigation/native';
import { createNativeStackNavigator } from '@react-navigation/native-stack';

import telaInicio from './src/pages/telaInicio/index';
import Pergunta01 from './src/pages/pergunta01/index';


const Stack = createNativeStackNavigator();

export default function App() {
  return (
    <NavigationContainer>
      <Stack.Navigator>
        <Stack.Screen name="Quiz" component={telaInicio} />
        <Stack.Screen name="Pergunta01" component={Pergunta01} />
      </Stack.Navigator>
    </NavigationContainer>
  );
}