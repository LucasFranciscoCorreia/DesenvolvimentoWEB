 <template>
<nao-logado>
<div class="col" style="background-color:#6DE16A; height: 100px; width: 96%; left: 2%;" align="center">
            <div class="container col-lg-8 mr-auto">
                <p class="white-text" style="text-align: center; font-size: 60px;font-weight: bold;font-family: Lato">
                    <b>Contato</b>
                </p>
            </div>
        </div>
        <div class="row py-3">
            <form id="contact-form" class="col-lg-6">

                <div class="messages"></div>

                <div class="controls">

                    <div class="row">
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="form_name">Nome*</label>
                                <input id="form_name" type="text" name="name" class="form-control" required="required"
                                    data-error="Firstname is required.">
                                <div class="help-block with-errors"></div>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="form_email">Email*</label>
                                <input id="form_email" type="email" name="email" class="form-control"
                                    required="required" data-error="Valid email is required.">
                                <div class="help-block with-errors"></div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-12">
                            <div class="form-group">
                                <label for="form_need">Motivo do contato*</label>
                                <select id="form_need" name="need" class="form-control" required="required"
                                    data-error="Please specify your need.">
                                    <option value=""></option>
                                    <option value="Duvidas">Dúvidas</option>
                                    <option value="Reclamacao">Reclamação</option>
                                    <option value="Sugestao">Sugestão</option>
                                    <option value="Outros">Outros</option>
                                </select>
                                <div class="help-block with-errors"></div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-12">
                            <div class="form-group">
                                <label for="form_message">Mensagem*</label>
                                <textarea id="form_message" name="message" class="form-control" rows="4"
                                    required="required" data-error="Please, leave us a message."></textarea>
                                <div class="help-block with-errors"></div>
                            </div>
                        </div>
                        <div class="col-md-12">
                            <input type="submit" class="btn btn-success btn-send" value="Enviar">
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-12">
                            <p class="text-muted">
                                <strong>*</strong> Estes campos são obrigatórios.
                        </div>
                    </div>
                </div>
            </form>

            <div class="col" style="top: 5px; right: 1%;">
                <iframe
                    src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d987.7048011666056!2d-34.94483240328334!3d-8.017571510408454!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x7ab198c1040db71%3A0xeefd7d59b3a40ce6!2sCEAGRI+II+-+UFRPE!5e0!3m2!1spt-BR!2sbr!4v1557189181519!5m2!1spt-BR!2sbr"
                    width="600" height="450" frameborder="0" style="border:0" allowfullscreen></iframe>
            </div>
        </div>
</nao-logado>

</template>

<script>
import templateLogado from './components/shared/painel/templateNaoLogado.vue';

export default{

  components: {
    'nao-logado' : templateNaoLogado
  },

  data (){
    return{
    }
  }
}
</script>

<style scoped>

</style>
