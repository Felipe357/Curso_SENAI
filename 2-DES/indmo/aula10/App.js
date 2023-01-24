import { NavigationContainer } from '@react-navigation/native';

import poke from './pages/poke'
import poke2 from './pages/poke2'

import {
  createDrawerNavigator,
  DrawerContentScrollView,
  DrawerItemList,
  DrawerItem,
} from '@react-navigation/drawer';

const Drawer = createDrawerNavigator();

function MyDrawer() {
  return (
    <Drawer.Navigator
      useLegacyImplementation
    >
      <Drawer.Screen name="Feed" component={poke} />
      <Drawer.Screen name="Article" component={poke2} />
    </Drawer.Navigator>
  );
}

export default function App() {
  return (
    <NavigationContainer>
      <MyDrawer />
    </NavigationContainer>
  );
}