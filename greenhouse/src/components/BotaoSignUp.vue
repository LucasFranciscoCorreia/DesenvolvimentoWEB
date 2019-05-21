<template>
	<div>
		<SignUp/>
		<button type="button" class="btn btn-dark"  @click="$modal.show('demo-login')">Sign up</button>
	</div>
	
</template>
<script>
	import SignUp from './SignUp.vue'
	export default {
		name: "BotaoSignUp",
		components:{
			SignUp,
		},
		props:{
			isLogged: Boolean
		}
	};
</script>