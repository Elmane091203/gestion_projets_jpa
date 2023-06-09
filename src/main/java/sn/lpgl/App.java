package sn.lpgl;

import sn.lpgl.config.HibernateUtil;

public class App {
    public static void main(String[] args) {
        HibernateUtil.getSessionFactory();
    }
}
