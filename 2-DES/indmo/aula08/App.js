import * as React from 'react';
import { NavigationContainer } from '@react-navigation/native';
import { createNativeStackNavigator } from '@react-navigation/native-stack';

import telaInicio from './src/pages/telaInicio/index';
import Pergunta01 from './src/pages/pergunta01/index';
import Pergunta02 from './src/pages/pergunta02/index';
import Pergunta03 from './src/pages/pergunta03/index';
import Pergunta04 from './src/pages/pergunta04/index';
import Pergunta05 from './src/pages/pergunta04/index';


const Stack = createNativeStackNavigator();

export default function App() {
  return (
    <NavigationContainer>
      <Stack.Navigator>
        <Stack.Screen name="Quiz" component={telaInicio} />
        <Stack.Screen name="Pergunta01" component={Pergunta01} />
        <Stack.Screen name="Pergunta02" component={Pergunta02} />
        <Stack.Screen name="Pergunta03" component={Pergunta03} />
        <Stack.Screen name="Pergunta04" component={Pergunta04} />
        <Stack.Screen name="Pergunta05" component={Pergunta04} />
      </Stack.Navigator>
    </NavigationContainer>
  );
}