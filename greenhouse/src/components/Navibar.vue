<template> 
    <ul  class="navbar-nav mr-auto"> 
        <ListItem name="Inicio"/> 
        <ListItem name="Sobre"/> 
        <ListItem name="Produtos"/> 
        <ListItem name="Serviços"/> 
        <ListItem name="Contato"/> 
        <ListItem name="Sign in"/> 
    </ul> 
</template> 
 
<script> 
import ListItem from './ListItemNavi.vue' 
export default { 
    name: 'Navibar', 
    components: { 
        ListItem, 
    } 
} 
</script> 
 
<style scoped> 

</style>