/* Generated By:JavaCC: Do not edit this line. ParserTokenManager.java */
/**
 * Copyright 2007 The Apache Software Foundation
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.hadoop.hbase.shell.generated;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.io.StringReader;
import java.io.Reader;
import org.apache.hadoop.hbase.shell.*;

public class ParserTokenManager implements ParserConstants
{
  public  java.io.PrintStream debugStream = System.out;
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0xffffe0L) != 0L)
         {
            jjmatchedKind = 31;
            return 13;
         }
         if ((active0 & 0x40000000L) != 0L)
            return 1;
         return -1;
      case 1:
         if ((active0 & 0x7fffe0L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 1;
            return 13;
         }
         if ((active0 & 0x800000L) != 0L)
            return 13;
         return -1;
      case 2:
         if ((active0 & 0x408000L) != 0L)
            return 13;
         if ((active0 & 0x3f7fe0L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 2;
            return 13;
         }
         return -1;
      case 3:
         if ((active0 & 0x3d7340L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 3;
            return 13;
         }
         if ((active0 & 0x20ca0L) != 0L)
            return 13;
         return -1;
      case 4:
         if ((active0 & 0x300040L) != 0L)
            return 13;
         if ((active0 & 0xd7300L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 4;
            return 13;
         }
         return -1;
      case 5:
         if ((active0 & 0xd7200L) != 0L)
            return 13;
         if ((active0 & 0x100L) != 0L)
         {
            if (jjmatchedPos != 5)
            {
               jjmatchedKind = 31;
               jjmatchedPos = 5;
            }
            return 13;
         }
         return -1;
      case 6:
         if ((active0 & 0x80100L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 6;
            return 13;
         }
         return -1;
      case 7:
         if ((active0 & 0x100L) != 0L)
            return 13;
         if ((active0 & 0x80000L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 7;
            return 13;
         }
         return -1;
      case 8:
         if ((active0 & 0x80000L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 8;
            return 13;
         }
         return -1;
      case 9:
         if ((active0 & 0x80000L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 9;
            return 13;
         }
         return -1;
      case 10:
         if ((active0 & 0x80000L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 10;
            return 13;
         }
         return -1;
      case 11:
         if ((active0 & 0x80000L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 11;
            return 13;
         }
         return -1;
      case 12:
         if ((active0 & 0x80000L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 12;
            return 13;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private final int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private final int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
private final int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 40:
         return jjStopAtPos(0, 26);
      case 41:
         return jjStopAtPos(0, 27);
      case 44:
         return jjStopAtPos(0, 24);
      case 45:
         return jjStartNfaWithStates_0(0, 30, 1);
      case 46:
         return jjStopAtPos(0, 25);
      case 59:
         return jjStopAtPos(0, 36);
      case 60:
         return jjMoveStringLiteralDfa1_0(0x20000000L);
      case 61:
         return jjStopAtPos(0, 28);
      case 65:
      case 97:
         return jjMoveStringLiteralDfa1_0(0x400000L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa1_0(0x90240L);
      case 68:
      case 100:
         return jjMoveStringLiteralDfa1_0(0x2500L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa1_0(0x800L);
      case 72:
      case 104:
         return jjMoveStringLiteralDfa1_0(0x20L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa1_0(0x1000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa1_0(0x200000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa1_0(0x800000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa1_0(0x8000L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa1_0(0x4080L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa1_0(0x20000L);
      case 86:
      case 118:
         return jjMoveStringLiteralDfa1_0(0x40000L);
      case 87:
      case 119:
         return jjMoveStringLiteralDfa1_0(0x100000L);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private final int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 62:
         if ((active0 & 0x20000000L) != 0L)
            return jjStopAtPos(1, 29);
         break;
      case 65:
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x40000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x6120L);
      case 72:
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x100080L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x220000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x40L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x401000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x98000L);
      case 82:
      case 114:
         if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(1, 23, 13);
         return jjMoveStringLiteralDfa2_0(active0, 0x600L);
      case 88:
      case 120:
         return jjMoveStringLiteralDfa2_0(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private final int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 68:
      case 100:
         if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(2, 22, 13);
         break;
      case 69:
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x100240L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x800L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0xd6020L);
      case 77:
      case 109:
         return jjMoveStringLiteralDfa3_0(active0, 0x220000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x480L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x1100L);
      case 87:
      case 119:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(2, 15, 13);
         break;
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private final int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x240L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa4_0(active0, 0x100L);
      case 69:
      case 101:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(3, 17, 13);
         return jjMoveStringLiteralDfa4_0(active0, 0x7000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x200000L);
      case 80:
      case 112:
         if ((active0 & 0x20L) != 0L)
            return jjStartNfaWithStates_0(3, 5, 13);
         else if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(3, 10, 13);
         break;
      case 82:
      case 114:
         return jjMoveStringLiteralDfa4_0(active0, 0x100000L);
      case 84:
      case 116:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(3, 11, 13);
         break;
      case 85:
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0xd0000L);
      case 87:
      case 119:
         if ((active0 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(3, 7, 13);
         break;
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private final int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 67:
      case 99:
         return jjMoveStringLiteralDfa5_0(active0, 0x4000L);
      case 69:
      case 101:
         if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(4, 20, 13);
         return jjMoveStringLiteralDfa5_0(active0, 0x40000L);
      case 77:
      case 109:
         return jjMoveStringLiteralDfa5_0(active0, 0x90000L);
      case 82:
      case 114:
         if ((active0 & 0x40L) != 0L)
            return jjStartNfaWithStates_0(4, 6, 13);
         return jjMoveStringLiteralDfa5_0(active0, 0x1100L);
      case 84:
      case 116:
         if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(4, 21, 13);
         return jjMoveStringLiteralDfa5_0(active0, 0x2200L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private final int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 69:
      case 101:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(5, 9, 13);
         else if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(5, 13, 13);
         break;
      case 73:
      case 105:
         return jjMoveStringLiteralDfa6_0(active0, 0x100L);
      case 78:
      case 110:
         if ((active0 & 0x10000L) != 0L)
         {
            jjmatchedKind = 16;
            jjmatchedPos = 5;
         }
         return jjMoveStringLiteralDfa6_0(active0, 0x80000L);
      case 83:
      case 115:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(5, 18, 13);
         break;
      case 84:
      case 116:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(5, 12, 13);
         else if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(5, 14, 13);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private final int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 66:
      case 98:
         return jjMoveStringLiteralDfa7_0(active0, 0x100L);
      case 70:
      case 102:
         return jjMoveStringLiteralDfa7_0(active0, 0x80000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private final int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa8_0(active0, 0x80000L);
      case 69:
      case 101:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(7, 8, 13);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
private final int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 77:
      case 109:
         return jjMoveStringLiteralDfa9_0(active0, 0x80000L);
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
private final int jjMoveStringLiteralDfa9_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 73:
      case 105:
         return jjMoveStringLiteralDfa10_0(active0, 0x80000L);
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
private final int jjMoveStringLiteralDfa10_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(8, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(9, active0);
      return 10;
   }
   switch(curChar)
   {
      case 76:
      case 108:
         return jjMoveStringLiteralDfa11_0(active0, 0x80000L);
      default :
         break;
   }
   return jjStartNfa_0(9, active0);
}
private final int jjMoveStringLiteralDfa11_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(9, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(10, active0);
      return 11;
   }
   switch(curChar)
   {
      case 73:
      case 105:
         return jjMoveStringLiteralDfa12_0(active0, 0x80000L);
      default :
         break;
   }
   return jjStartNfa_0(10, active0);
}
private final int jjMoveStringLiteralDfa12_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(10, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(11, active0);
      return 12;
   }
   switch(curChar)
   {
      case 69:
      case 101:
         return jjMoveStringLiteralDfa13_0(active0, 0x80000L);
      default :
         break;
   }
   return jjStartNfa_0(11, active0);
}
private final int jjMoveStringLiteralDfa13_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(11, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(12, active0);
      return 13;
   }
   switch(curChar)
   {
      case 83:
      case 115:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(13, 19, 13);
         break;
      default :
         break;
   }
   return jjStartNfa_0(12, active0);
}
private final void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private final void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private final void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}
private final void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}
private final void jjCheckNAddStates(int start)
{
   jjCheckNAdd(jjnextStates[start]);
   jjCheckNAdd(jjnextStates[start + 1]);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private final int jjMoveNfa_0(int startState, int curPos)
{
   int[] nextStates;
   int startsAt = 0;
   jjnewStateCnt = 13;
   int i = 1;
   jjstateSet[0] = startState;
   int j, kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 33)
                        kind = 33;
                     jjCheckNAdd(3);
                  }
                  else if (curChar == 39)
                     jjCheckNAddStates(0, 2);
                  else if (curChar == 34)
                     jjCheckNAdd(5);
                  else if (curChar == 45)
                  {
                     if (kind > 31)
                        kind = 31;
                     jjCheckNAdd(1);
                  }
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 32)
                        kind = 32;
                     jjCheckNAdd(2);
                  }
                  break;
               case 13:
                  if ((0x3ff200000000000L & l) != 0L)
                  {
                     if (kind > 31)
                        kind = 31;
                     jjCheckNAdd(1);
                  }
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 33)
                        kind = 33;
                     jjCheckNAdd(3);
                  }
                  break;
               case 1:
                  if ((0x3ff200000000000L & l) == 0L)
                     break;
                  if (kind > 31)
                     kind = 31;
                  jjCheckNAdd(1);
                  break;
               case 2:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 32)
                     kind = 32;
                  jjCheckNAdd(2);
                  break;
               case 3:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 33)
                     kind = 33;
                  jjCheckNAdd(3);
                  break;
               case 4:
                  if (curChar == 34)
                     jjCheckNAdd(5);
                  break;
               case 5:
                  if ((0xfffffffbffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(5, 6);
                  break;
               case 6:
                  if (curChar == 34 && kind > 34)
                     kind = 34;
                  break;
               case 7:
                  if (curChar == 39)
                     jjCheckNAddStates(0, 2);
                  break;
               case 8:
                  if ((0xffffff7fffffffffL & l) != 0L)
                     jjCheckNAddStates(0, 2);
                  break;
               case 9:
                  if (curChar == 39)
                     jjCheckNAddStates(3, 5);
                  break;
               case 10:
                  if (curChar == 39)
                     jjstateSet[jjnewStateCnt++] = 9;
                  break;
               case 11:
                  if ((0xffffff7fffffffffL & l) != 0L)
                     jjCheckNAddStates(3, 5);
                  break;
               case 12:
                  if (curChar == 39 && kind > 35)
                     kind = 35;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 31)
                        kind = 31;
                     jjCheckNAdd(1);
                  }
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 33)
                        kind = 33;
                     jjCheckNAdd(3);
                  }
                  break;
               case 13:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 31)
                        kind = 31;
                     jjCheckNAdd(1);
                  }
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 33)
                        kind = 33;
                     jjCheckNAdd(3);
                  }
                  break;
               case 1:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 31)
                     kind = 31;
                  jjCheckNAdd(1);
                  break;
               case 3:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 33)
                     kind = 33;
                  jjCheckNAdd(3);
                  break;
               case 5:
                  jjAddStates(6, 7);
                  break;
               case 8:
                  jjCheckNAddStates(0, 2);
                  break;
               case 11:
                  jjCheckNAddStates(3, 5);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 5:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(6, 7);
                  break;
               case 8:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjCheckNAddStates(0, 2);
                  break;
               case 11:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjCheckNAddStates(3, 5);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 13 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   8, 10, 12, 10, 11, 12, 5, 6, 
};
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, "\54", "\56", 
"\50", "\51", "\75", "\74\76", "\55", null, null, null, null, null, "\73", };
public static final String[] lexStateNames = {
   "DEFAULT", 
};
static final long[] jjtoToken = {
   0x1fffffffe1L, 
};
static final long[] jjtoSkip = {
   0x1eL, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[13];
private final int[] jjstateSet = new int[26];
protected char curChar;
public ParserTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}
public ParserTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private final void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 13; i-- > 0;)
      jjrounds[i] = 0x80000000;
}
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   Token t = Token.newToken(jjmatchedKind);
   t.kind = jjmatchedKind;
   String im = jjstrLiteralImages[jjmatchedKind];
   t.image = (im == null) ? input_stream.GetImage() : im;
   t.beginLine = input_stream.getBeginLine();
   t.beginColumn = input_stream.getBeginColumn();
   t.endLine = input_stream.getEndLine();
   t.endColumn = input_stream.getEndColumn();
   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

public Token getNextToken() 
{
  int kind;
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {   
   try   
   {     
      curChar = input_stream.BeginToken();
   }     
   catch(java.io.IOException e)
   {        
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

}
