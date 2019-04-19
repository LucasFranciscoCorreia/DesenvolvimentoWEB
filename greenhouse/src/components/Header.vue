<template> 
    <div class="container">
        <!--
        <div class="row">
            <NaviLogo/>
            <Navibar/>
        -->
        <!-- <nav class="navbar navbar-expand-lg navbar-light bg-light"> -->
        <!-- <nav class="navbar navbar-light" style="background-color: #00ff00;"> -->    
        <nav class="navbar navbar-expand-lg navbar-light bg-light fixed-top" style="background-color: #00ff00;">
            <NaviLogo/>
            <div class="ml-auto"></div>
            <div><Navibar/></div>
                <!--
                    <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="#">Inicio<span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item">
                       <a class="nav-link" href="#">Sobre</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Produtos</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Serviços</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Contato</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Sign in</a>
                    </li>
                </ul>
                 -->
        </nav>

        </div>
             
</template> 
 
<script> 
import Navibar from './Navibar.vue' 
import NaviLogo from './NaviLogo.vue' 
 
 
export default { 
    name: 'Header', 
    components: { 
        Navibar,
        NaviLogo
    } 
} 
</script> 
 
<style scoped> 
</style> 