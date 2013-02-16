package com.awesomevendingco.vendingmachine.ui;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.awesomevendingco.vendingmachine.machine.VendingMachine;

public class InsertCoinServlet extends HelpfulServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        VendingMachine machine = (VendingMachine) getApplicationScope(getServletContext(), "machine");
        String coin = request.getParameter("insertcoin");
        machine.insertCoin(coin);
        forwardToPage(request, response, "/machine.jsp");
    }

}