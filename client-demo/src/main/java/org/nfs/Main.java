package org.nfs;

import com.emc.ecs.nfsclient.nfs.io.Nfs3File;
import com.emc.ecs.nfsclient.nfs.nfs3.Nfs3;
import com.emc.ecs.nfsclient.rpc.CredentialUnix;

import java.io.IOException;

/**
 * @author Created by wbb on 2024-02-21 18:24:14
 *///TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        Nfs3 nfs3 = new Nfs3("10.65.60.182:/data/nfs", new CredentialUnix(0, 0, null), 3);
        Nfs3File test = new Nfs3File(nfs3, "/test2");
        System.out.println(test.exists());
        if (!test.exists()) {
            test.mkdir();
        }
        System.out.println("ok");
        System.exit(0);
    }
}