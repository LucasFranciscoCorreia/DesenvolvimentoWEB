<template>
    <div class="menu">
        <ul>
            <ListItem name="Inicio"/>
            <ListItem name="Sobre"/>
            <ListItem name="Produtos"/>
            <ListItem name="Serviços"/>
            <ListItem name="Contato"/>
            <ListItem name="Sign in"/>
        </ul>
    </div>
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
.menu{
    float: right;
    width: 50%;
    padding: 2%;
    padding-right: 10%;
    background-color: aqua
}
.menu ul{
    list-style: none;
    text-align: right;
}

.menu ul li{
    display: inline;
}

.menu ul li a{
    display: inline-block;
    text-decoration: none;
    color:black;
}

</style>