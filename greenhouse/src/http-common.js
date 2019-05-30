import axios from 'axios'

export default axios.create({
    baseURL: 'http://localhost:4201',
    headers: {
        'Content-type': 'application/json'
    }
})

