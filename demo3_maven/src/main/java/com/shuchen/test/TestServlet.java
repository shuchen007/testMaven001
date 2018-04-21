package com.shuchen.test;

import com.hao.demo2.Hello1;
import com.shuchen.hao.Hello;
import hello.HelloTest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by Lenovo on 2016/2/25.
 */
@WebServlet("/myController")
public class TestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.err.println("doget-");
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("--dopost-");
        //解决乱码
        req.setCharacterEncoding("UTF-8");
        String name=req.getParameter("name");
        req.setAttribute("name",name);
        HttpSession session = req.getSession();
        HelloTest helloTest = new HelloTest();
        String a = helloTest.main1();
        System.out.println("a="+a);
        req.setAttribute("do",a);
        System.out.println(name);

        Hello hi = new Hello();
        hi.hello();
        hi.hello();

        Hello1 hi1 = new Hello1();
        hi1.hello1();

        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }

}
