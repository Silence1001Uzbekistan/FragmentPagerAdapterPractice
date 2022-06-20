package uz.silence.fragmentpagerpractice.CLASS

import java.io.Serializable

class User : Serializable {

    var nameC: String? = null
    var imageC: Int? = null


    constructor(nameC: String?, imageC: Int?) {
        this.nameC = nameC
        this.imageC = imageC
    }

    constructor()
}