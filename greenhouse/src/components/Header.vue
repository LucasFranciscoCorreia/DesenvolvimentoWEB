<template>
    <div>
        <section class="header">
            <NaviLogo/>
            <Navibar/>
        </section>
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
.header{
    
}
</style>
