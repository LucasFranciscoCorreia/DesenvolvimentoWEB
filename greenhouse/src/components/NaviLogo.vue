<template>
    <div class="navilogo">
        <div>
            <img src="../assets/logo.png" alt="logo">
            <h1>GreenHouse</h1>
        </div>
    </div>
</template>

<script>
export default {
    name: 'NaviLogo'
}
</script>

<style scoped>

.navilogo{
    width: 25%;
    height: 10em;
    padding-left: 5%;
    background-color: aqua;
    border-style: solid;
    border-width: 10px;
    float: left;
}

h1{
    float: right;
    padding: 5%;
    margin-top: 15%;
    font-size: 30px;
    background-color:gray;
}

.logo{
    
}

img{
    width: 40%;
    height: auto;
    padding: 5%;    
    float: left;
    background-color: blueviolet;
}

</style>
