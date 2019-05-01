<template> 
    <div class="container">    
        <nav class="navbar navbar-expand-lg navbar-light bg-light fixed-top" style="background-color: #00ff00;">
            <NaviLogo/>
            <div class="ml-auto"></div>
            <div><Navibar/></div>
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