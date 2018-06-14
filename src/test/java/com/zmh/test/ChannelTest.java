package com.zmh.test;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author zhuangmh
 * time 2018/6/13 17:14
 */
public class ChannelTest {

    @Test
   public void fileChannelTest() throws Exception {
       RandomAccessFile file = new RandomAccessFile("aa", "rw");

       FileChannel fileChannel = file.getChannel();
       ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
       int result = fileChannel.read(byteBuffer);

       while (result != -1) {
            

       }

   }

}
