<template> 
    <li class="nav-item"><a class="nav-link" href="#">{{ name }}</a></li>  
</template> 
 
<script> 
export default { 
    name: 'ListItem', 
    props: { 
        name: String 
    } 
}
 
</script> 
 
<style scoped> 
#navi{ 
    padding: 1%; 
    list-style-type: none; 
    font-size: 30px; 
    border: 10px 
} 
 
</style> 