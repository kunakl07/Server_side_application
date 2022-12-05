
package com.example.server_side;
import android.os.AsyncTask;
import android.provider.ContactsContract;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.channels.AsynchronousChannelGroup;

public class MessageSender extends AsyncTask<String, Void, Void> {

        Socket s;
        DataOutputStream dos;
        PrintWriter pw;

@Override
protected Void doInBackground(String... voids){
        String message = voids[0];

        System.out.print(voids);

        try {

        s = new Socket("10.201.80.108", 12346);
        pw = new PrintWriter (s.getOutputStream());
        pw.write(message);
        pw.flush();
        pw.close();
        s.close();
        }

        catch (IOException e){
        e.printStackTrace();
        }
        return null;
        }
        }

