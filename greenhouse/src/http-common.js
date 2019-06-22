import axios from 'axios'

export default axios.create({
    //baseURL: 'http://localhost:4201',
    baseURL: 'https://greenhouse-backend.herokuapp.com',
    headers: {
        'Content-type': 'application/json'
    }
})

