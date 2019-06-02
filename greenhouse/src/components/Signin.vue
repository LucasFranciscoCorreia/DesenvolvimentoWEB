<template>
  <li class="nav-item dropdown">
    <a
      class="nav-link dropdown-toggle"
      id="navbarDropdownMenuLink-4"
      data-toggle="dropdown"
      aria-haspopup="true"
      aria-expanded="false"
    >Sign in</a>
    <div
      class="dropdown-menu dropdown-menu-right dropdown-info"
      aria-labelledby="navbarDropdownMenuLink-4"
    >
      <!-- Material form login -->
      <div class="card">
        <h5 class="card-header info-color white-text text-center py-4">
          <strong>Sign in</strong>
        </h5>

        <!--Card content-->
        <div class="card-body px-lg-5 pt-0">
          <!-- Form -->
          <form class="text-center" style="color: #757575;">
            <br class="py-2">
            <input
              type="email"
              id="defaultLoginFormEmail"
              class="form-control mb-4"
              placeholder="E-mail"
              v-model="email"
            >

            <!-- Password -->
            <input
              type="password"
              id="defaultLoginFormPassword"
              class="form-control mb-4"
              placeholder="Password"
              v-model="password"
            >

            <div class="d-flex justify-content-around">
              <div>
                <!-- Remember me -->
                <div class="form-check">
                  <input type="checkbox" class="form-check-input" id="materialLoginFormRemember">
                  <label class="form-check-label" for="materialLoginFormRemember">Remember me</label>
                </div>
              </div>
              <div>
                <!-- Forgot password -->
                <a href>Forgot password?</a>
              </div>
            </div>

            <!-- Sign in button -->
            <button
              class="btn btn-outline-info btn-rounded btn-block my-4 waves-effect z-depth-0"
              type="submit"
              style="border-radius: 2rem"
              v-on:click="loginIn()"
            >Sign in</button>

            <!-- Register -->
            <p>
              Not a member?
              <a href>Register</a>
            </p>
          </form>
          <!-- Form -->
        </div>
      </div>
      <!-- Material form login -->
    </div>
  </li>
</template>

<script>
export default {
  name: "Signin",
  props: {
    isLogged: Boolean,
    email: "",
    password:"",
  },
  methods: {
    loginIn() {
      alert("entrou")
      if (this.email && this.password) {
        var url = "/users/filter?email=" + this.email
        http
          .get(url)
          .then(response => {
            if(response.password.equals(this.password)){
              this.isLogged = true;
            this.selected = "/user";
            alert("Usuario conectado")
            }else{
              alert("Usuario ou senha incorreta")
            }
            
            
          });
      }else{
        alert("Preencha os campos")
      }
      
      
    }
  }
};
</script>

<style scoped>
</style>
