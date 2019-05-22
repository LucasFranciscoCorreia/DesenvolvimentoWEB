 <template>
<body>
    <header>
        <nav class="navbar navbar-expand-lg navbar-light mr-auto">
            <a class="navbar-brand" href="template_naologado.html"><img src="assets/logo.png" height="30"
                    class="d-inline-block" alt="mdb logo">GreenHouse</a>
            <button class="navbar-toggler ml-auto" type="button" data-toggle="collapse" data-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse ml-auto" id="navbarNav">
                <ul class="navbar-nav ml-auto">
                    <li class="nav-item active">
                        <a class="nav-link disabled" href="#">Inicio <span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="Sobre.html">Sobre</a>
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
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" id="navbarDropdownMenuLink-4" data-toggle="dropdown"
                            aria-haspopup="true" aria-expanded="false">
                            Sign in </a>
                        <div class="dropdown-menu dropdown-menu-right dropdown-info"
                            aria-labelledby="navbarDropdownMenuLink-4">
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
                                        <input type="email" id="defaultLoginFormEmail" class="form-control mb-4"
                                            placeholder="E-mail">

                                        <!-- Password -->
                                        <input type="password" id="defaultLoginFormPassword" class="form-control mb-4"
                                            placeholder="Password">

                                        <div class="d-flex justify-content-around">
                                            <div>
                                                <!-- Remember me -->
                                                <div class="form-check">
                                                    <input type="checkbox" class="form-check-input"
                                                        id="materialLoginFormRemember">
                                                    <label class="form-check-label"
                                                        for="materialLoginFormRemember">Remember me</label>
                                                </div>
                                            </div>
                                            <div>
                                                <!-- Forgot password -->
                                                <a href="">Forgot password?</a>
                                            </div>
                                        </div>

                                        <!-- Sign in button -->
                                        <button
                                            class="btn btn-outline-info btn-rounded btn-block my-4 waves-effect z-depth-0"
                                            type="submit">Sign in</button>

                                        <!-- Register -->
                                        <p>Not a member?
                                            <a href="">Register</a>
                                        </p>
                                    </form>
                                    <!-- Form -->

                                </div>

                            </div>
                            <!-- Material form login -->
                        </div>
                    </li>
                </ul>
            </div>
        </nav>
    </header>
    <slot>
        
    </slot>
    <!-- Footer -->
    <footer class="page-footer font-small unique-color-dark py-1">

        <!-- Footer Links -->
        <div class="container text-center text-md-left mt-5">

            <!-- Grid row -->
            <div class="row mt-3">

                <!-- Grid column -->
                <div class="col-md-3 col-lg-4 col-xl-3 mx-auto mb-4">

                    <!-- Content -->
                    <h6 class="text-uppercase font-weight-bold">GreenHouse</h6>
                    <hr class="deep-purple accent-2 mb-4 mt-0 d-inline-block mx-auto" style="width: 60px;">

                </div>
                <!-- Grid column -->

                <!-- Grid column -->
                <div class="col-md-2 col-lg-2 col-xl-2 mx-auto mb-4">

                    <p>
                        <a href="#!">Home</a>
                    </p>
                    <p>
                        <a href="#!">About</a>
                    </p>
                    <p>
                        <a href="#!">Features</a>
                    </p>
                    <p>
                        <a href="#!">Pricing</a>
                    </p>
                    <p>
                        <a href="#!">Contact us</a>
                    </p>

                </div>
                <!-- Grid column -->

                <!-- Grid column -->
                <div class="col-md-3 col-lg-2 col-xl-2 mx-auto mb-4">

                    <!-- Links -->
                    <p>
                        <a href="#!">Blog</a>
                    </p>
                    <p>
                        <a href="#!">Search</a>
                    </p>
                    <p>
                        <a href="#!">T & Cs</a>
                    </p>
                    <p>
                        <a href="#!">Privacy</a>
                    </p>
                    <p>
                        <a href="#!">Community</a>
                    </p>
                </div>
                <!-- Grid column -->

                <!-- Grid column -->
                <div class="col-md-4 col-lg-3 col-xl-3 mx-auto mb-md-0 mb-4">

                    <p class="font-small">
                        <i class="mr-auto">Get our newsletter</i>
                    </p>
                    <form class="input-group">
                        <input type="text" class="form-control form-control-sm" placeholder="Your email"
                            aria-label="Your email" aria-describedby="basic-addon2">
                        <div class="input-group-append">
                            <button class="btn btn-sm btn-outline-white my-0" type="button">Subscribe</button>
                        </div>
                    </form>
                    <br>
                    <!--Facebook-->
                    <a class="fb-ic mr-3" role="button"><i class="fab fa-lg fa-facebook-f"></i></a>
                    <!--Twitter-->
                    <a class="tw-ic mr-3" role="button"><i class="fab fa-lg fa-twitter"></i></a>
                    <!--Google +-->
                    <a class="gplus-ic mr-3" role="button"><i class="fab fa-lg fa-google-plus-g"></i></a>
                    <!--Instagram-->
                    <a class="ins-ic mr-3" role="button"><i class="fab fa-lg fa-instagram"></i></a>
                    <!--Youtube-->
                    <a class="yt-ic mr-3" role="button"><i class="fab fa-lg fa-youtube"></i></a>
                </div>
                <!-- Grid column -->
            </div>
            <!-- Grid row -->
        </div>
    </footer>
</body>
</template>

<script>
export default{
   props: ['titulo']
}
</script>

<style scoped>

</style>
