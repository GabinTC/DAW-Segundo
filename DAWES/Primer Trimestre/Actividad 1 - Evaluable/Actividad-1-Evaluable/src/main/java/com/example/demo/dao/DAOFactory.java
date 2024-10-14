package com.example.demo.dao;

import com.example.demo.dao.DAOPost.DAOPost;
import com.example.demo.dao.DAOPost.DAOPostRAM;
import com.example.demo.dao.DAOUsuario.DAOUsuario;
import com.example.demo.dao.DAOUsuario.DAOUsuarioRAM;

public class DAOFactory {

    private static DAOFactory instance;
    private DAOPost daoPost;
    private DAOUsuario daoUsuario;

    public DAOFactory() {
    }

    public static DAOFactory getInstance() {
        if(DAOFactory.instance == null){
            DAOFactory.instance = new DAOFactory();
        }
        return instance;
    }

    public DAOPost getDAOPost() {
        if(this.daoPost == null){
            this.daoPost = new DAOPostRAM();
        }
        return this.daoPost;
    }

    public DAOUsuario getDaoUsuario() {
        if(this.daoUsuario == null){
            this.daoUsuario = new DAOUsuarioRAM();
        }
        return this.daoUsuario;
    }

}
