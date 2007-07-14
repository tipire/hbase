/* Generated By:JavaCC: Do not edit this line. Parser.java */
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

/**
 * Parsing command line.
 */
public class Parser implements ParserConstants {
  private static String QueryString;

  public Parser(String query) {
    this((Reader)(new StringReader(query)));
    this.QueryString = query;
  }

  public String getQueryStr() {
    return this.QueryString;
  }

/**
 * Parses the given array of command line arguments.
 */
  final public Command terminatedCommand() throws ParseException {
    Command statement = null;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case HELP:
    case CLEAR:
    case SHOW:
    case DESCRIBE:
    case CREATE:
    case DROP:
    case EXIT:
    case INSERT:
    case DELETE:
    case SELECT:
    case 36:
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case HELP:
      case CLEAR:
      case SHOW:
      case DESCRIBE:
      case CREATE:
      case DROP:
      case EXIT:
      case INSERT:
      case DELETE:
      case SELECT:
        statement = cmdStatement();
        break;
      default:
        jj_la1[0] = jj_gen;
        ;
      }
      jj_consume_token(36);
      break;
    case 0:
      jj_consume_token(0);
      break;
    default:
      jj_la1[1] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
        {if (true) return statement;}
    throw new Error("Missing return statement in function");
  }

  final public Command cmdStatement() throws ParseException {
    Command cmd = null;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case EXIT:
      cmd = exitCommand();
      break;
    case HELP:
      cmd = helpCommand();
      break;
    case SHOW:
      cmd = showCommand();
      break;
    case DESCRIBE:
      cmd = descCommand();
      break;
    case CREATE:
      cmd = createCommand();
      break;
    case DROP:
      cmd = dropCommand();
      break;
    case INSERT:
      cmd = insertCommand();
      break;
    case DELETE:
      cmd = deleteCommand();
      break;
    case SELECT:
      cmd = selectCommand();
      break;
    case CLEAR:
      cmd = clearCommand();
      break;
    default:
      jj_la1[2] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
       {if (true) return cmd;}
    throw new Error("Missing return statement in function");
  }

  final public ExitCommand exitCommand() throws ParseException {
  ExitCommand exit = new ExitCommand();
    jj_consume_token(EXIT);
             {if (true) return exit;}
    throw new Error("Missing return statement in function");
  }

  final public HelpCommand helpCommand() throws ParseException {
  Token t = null;
  HelpCommand help = new HelpCommand();
  String argument = "";
    jj_consume_token(HELP);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case CLEAR:
    case SHOW:
    case DESCRIBE:
    case CREATE:
    case DROP:
    case EXIT:
    case INSERT:
    case DELETE:
    case SELECT:
    case ID:
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case SHOW:
        t = jj_consume_token(SHOW);
        break;
      case DESCRIBE:
        t = jj_consume_token(DESCRIBE);
        break;
      case CREATE:
        t = jj_consume_token(CREATE);
        break;
      case DROP:
        t = jj_consume_token(DROP);
        break;
      case EXIT:
        t = jj_consume_token(EXIT);
        break;
      case INSERT:
        t = jj_consume_token(INSERT);
        break;
      case DELETE:
        t = jj_consume_token(DELETE);
        break;
      case SELECT:
        t = jj_consume_token(SELECT);
        break;
      case CLEAR:
        t = jj_consume_token(CLEAR);
        break;
      case ID:
        t = jj_consume_token(ID);
        break;
      default:
        jj_la1[3] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
         argument = t.image.toString();
      break;
    default:
      jj_la1[4] = jj_gen;
      ;
    }
      help.setArgument(argument);
      {if (true) return help;}
    throw new Error("Missing return statement in function");
  }

  final public ShowCommand showCommand() throws ParseException {
  ShowCommand show = new ShowCommand();
  String argument = null;
    jj_consume_token(SHOW);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ID:
    case QUOTED_STRING:
      argument = getString();
      break;
    default:
      jj_la1[5] = jj_gen;
      ;
    }
      show.setArgument(argument);
      {if (true) return show;}
    throw new Error("Missing return statement in function");
  }

  final public DescCommand descCommand() throws ParseException {
  DescCommand desc = new DescCommand();
  String argument = null;
    jj_consume_token(DESCRIBE);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ID:
    case QUOTED_STRING:
      argument = getString();
      break;
    default:
      jj_la1[6] = jj_gen;
      ;
    }
      desc.setArgument(argument);
      {if (true) return desc;}
    throw new Error("Missing return statement in function");
  }

  final public CreateCommand createCommand() throws ParseException {
  CreateCommand create = new CreateCommand();
  String argument = null;
  List<String> columnfamilies = null;
  int limit = 1;
    jj_consume_token(CREATE);
    argument = getString();
         create.setTable(argument);
    jj_consume_token(COLUMNFAMILIES);
    columnfamilies = getLiteralValues();
         create.setColumnfamilies(columnfamilies);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case LIMIT:
      jj_consume_token(LIMIT);
      jj_consume_token(EQUALS);
      limit = getInt();
            try{
               create.setLimit(limit);
            }catch(ClassCastException ce) {
               {if (true) throw generateParseException();}
        }
      break;
    default:
      jj_la1[7] = jj_gen;
      ;
    }
    {if (true) return create;}
    throw new Error("Missing return statement in function");
  }

  final public DropCommand dropCommand() throws ParseException {
  DropCommand drop = new DropCommand();
  String argument = null;
    jj_consume_token(DROP);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ID:
    case QUOTED_STRING:
      argument = getString();
      break;
    default:
      jj_la1[8] = jj_gen;
      ;
    }
      drop.setArgument(argument);
      {if (true) return drop;}
    throw new Error("Missing return statement in function");
  }

  final public InsertCommand insertCommand() throws ParseException {
    InsertCommand in = new InsertCommand();
    Map<String, List<String>> cond = null;
    List<String> columnfamilies = null;
    List<String> values = null;
    String table = null;
    jj_consume_token(INSERT);
    table = getString();
         in.setTable(table);
    columnfamilies = getLiteralValues();
        in.setColumnfamilies(columnfamilies);
    jj_consume_token(VALUES);
    values = getLiteralValues();
        in.setValues(values);
    jj_consume_token(WHERE);
    cond = WhereClause();
        try{
           in.setCondition(cond);
        }catch(ClassCastException ce) {
           {if (true) throw generateParseException();}
        }
       {if (true) return in;}
    throw new Error("Missing return statement in function");
  }

  final public DeleteCommand deleteCommand() throws ParseException {
    DeleteCommand del = new DeleteCommand();
    Map<String, List<String>> cond = null;
    String argument = null;
    jj_consume_token(DELETE);
    argument = getString();
         del.setTable(argument);
    jj_consume_token(WHERE);
    cond = WhereClause();
        try{
           del.setCondition(cond);
        }catch(ClassCastException ce) {
            {if (true) throw generateParseException();}
       }
       {if (true) return del;}
    throw new Error("Missing return statement in function");
  }

  final public SelectCommand selectCommand() throws ParseException {
    SelectCommand select = new SelectCommand();
    Map<String, List<String>> cond = null;
    String argument = null;
    int limit;
    jj_consume_token(SELECT);
    argument = getString();
         select.setTable(argument);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case WHERE:
      jj_consume_token(WHERE);
      cond = WhereClause();
        try{
           select.setCondition(cond);
        }catch(ClassCastException ce) {
            {if (true) throw generateParseException();}
        }
      break;
    default:
      jj_la1[9] = jj_gen;
      ;
    }
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case LIMIT:
      jj_consume_token(LIMIT);
      jj_consume_token(EQUALS);
      limit = getInt();
            try{
               select.setLimit(limit);
            }catch(ClassCastException ce) {
               {if (true) throw generateParseException();}
        }
      break;
    default:
      jj_la1[10] = jj_gen;
      ;
    }
    {if (true) return select;}
    throw new Error("Missing return statement in function");
  }

  final public ClearCommand clearCommand() throws ParseException {
  ClearCommand clear = new ClearCommand();
    jj_consume_token(CLEAR);
              {if (true) return clear;}
    throw new Error("Missing return statement in function");
  }

/**
* TODO : expressions codes need more love.
*/
  final public String getString() throws ParseException {
  Token t = null;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ID:
      t = jj_consume_token(ID);
      break;
    case QUOTED_STRING:
      t = jj_consume_token(QUOTED_STRING);
      break;
    default:
      jj_la1[11] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
      {if (true) return t.image.toString();}
    throw new Error("Missing return statement in function");
  }

  final public int getInt() throws ParseException {
  Token t = null;
    t = jj_consume_token(NUM);
     {if (true) return Integer.parseInt(t.image.toString());}
    throw new Error("Missing return statement in function");
  }

  final public Map<String, List<String>> WhereClause() throws ParseException {
    Map<String, List<String>> result =
               new HashMap<String, List<String>>();
    List<String> exception =
               new ArrayList<String>();
      try{
        result.putAll(ConditionExpression());
      }catch(ParseException pe) {
        exception.add(pe.toString());
        result.put("error", exception);
      }
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case AND:
        ;
        break;
      default:
        jj_la1[12] = jj_gen;
        break label_1;
      }
      jj_consume_token(AND);
      try{
        result.putAll(ConditionExpression());
      }catch(ParseException pe) {
        exception.add(pe.toString());
        result.put("error", exception);
      }
    }
   {if (true) return result;}
    throw new Error("Missing return statement in function");
  }

  final public Map<String, List<String>> ConditionExpression() throws ParseException {
    Token tSearchName, tComparator, tComparand;
    Map<String, List<String>> tmp =
               new HashMap<String, List<String>>();
    List<String> values =
               new ArrayList<String>();
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ROW:
      tSearchName = jj_consume_token(ROW);
      break;
    case COLUMN:
      tSearchName = jj_consume_token(COLUMN);
      break;
    case TIME:
      tSearchName = jj_consume_token(TIME);
      break;
    case ID:
      tSearchName = jj_consume_token(ID);
      break;
    case VALUES:
      tSearchName = jj_consume_token(VALUES);
      break;
    case COLUMNFAMILIES:
      tSearchName = jj_consume_token(COLUMNFAMILIES);
      break;
    default:
      jj_la1[13] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case EQUALS:
      tComparator = jj_consume_token(EQUALS);
      break;
    case NOTEQUAL:
      tComparator = jj_consume_token(NOTEQUAL);
      break;
    default:
      jj_la1[14] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case QUOTED_STRING:
      tComparand = jj_consume_token(QUOTED_STRING);
          values.add("quoted string");
          tmp.put("error", values);
          {if (true) return tmp;}
      break;
    case STRING_LITERAL:
      tComparand = jj_consume_token(STRING_LITERAL);
    values.add(tComparator.image);
    values.add(tComparand.image.substring(1,tComparand.image.length() - 1));

  if(tSearchName.image.toString().equals("row") ||
  tSearchName.image.toString().equals("column") ||
  tSearchName.image.toString().equals("time"))
    { tmp.put(tSearchName.image, values); }
  else
    {
    values.add(tSearchName.image.toString());
    tmp.put("error", values);
    }

    {if (true) return tmp;}
      break;
    default:
      jj_la1[15] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  final public List<String> getLiteralValues() throws ParseException {
    List<String> values = new ArrayList<String>();
    String literal = null;
    jj_consume_token(LPAREN);
   literal = getStringLiteral();
 if(literal != null) values.add(literal);
    label_2:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case COMMA:
      case ID:
      case STRING:
      case QUOTED_STRING:
      case STRING_LITERAL:
        ;
        break;
      default:
        jj_la1[16] = jj_gen;
        break label_2;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case COMMA:
        jj_consume_token(COMMA);
   literal = getStringLiteral();
   if(literal != null) values.add(literal);
        break;
      case ID:
      case STRING:
      case QUOTED_STRING:
      case STRING_LITERAL:
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case ID:
          jj_consume_token(ID);
          break;
        case STRING_LITERAL:
          jj_consume_token(STRING_LITERAL);
          break;
        case QUOTED_STRING:
          jj_consume_token(QUOTED_STRING);
          break;
        case STRING:
          jj_consume_token(STRING);
          break;
        default:
          jj_la1[17] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
       values.removeAll(values);
        break;
      default:
        jj_la1[18] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
    jj_consume_token(RPAREN);
     {if (true) return values;}
    throw new Error("Missing return statement in function");
  }

  final public String getStringLiteral() throws ParseException {
    Token stringLiteral;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case STRING_LITERAL:
      stringLiteral = jj_consume_token(STRING_LITERAL);
   {if (true) return stringLiteral.image.substring(1,stringLiteral.image.length() - 1);}
      break;
    case QUOTED_STRING:
      jj_consume_token(QUOTED_STRING);
                     {if (true) return null;}
      break;
    default:
      jj_la1[19] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  public ParserTokenManager token_source;
  SimpleCharStream jj_input_stream;
  public Token token, jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[20];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_0();
      jj_la1_1();
   }
   private static void jj_la1_0() {
      jj_la1_0 = new int[] {0x7fe0,0x7fe1,0x7fe0,0x80007fc0,0x80007fc0,0x80000000,0x80000000,0x200000,0x80000000,0x100000,0x200000,0x80000000,0x400000,0x800f8000,0x30000000,0x0,0x81000000,0x80000000,0x81000000,0x0,};
   }
   private static void jj_la1_1() {
      jj_la1_1 = new int[] {0x0,0x10,0x0,0x0,0x0,0x4,0x4,0x0,0x4,0x0,0x0,0x4,0x0,0x0,0x0,0xc,0xe,0xe,0xe,0xc,};
   }

  public Parser(java.io.InputStream stream) {
     this(stream, null);
  }
  public Parser(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new ParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 20; i++) jj_la1[i] = -1;
  }

  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 20; i++) jj_la1[i] = -1;
  }

  public Parser(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new ParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 20; i++) jj_la1[i] = -1;
  }

  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 20; i++) jj_la1[i] = -1;
  }

  public Parser(ParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 20; i++) jj_la1[i] = -1;
  }

  public void ReInit(ParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 20; i++) jj_la1[i] = -1;
  }

  final private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }

  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  final private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.Vector jj_expentries = new java.util.Vector();
  private int[] jj_expentry;
  private int jj_kind = -1;

  public ParseException generateParseException() {
    jj_expentries.removeAllElements();
    boolean[] la1tokens = new boolean[37];
    for (int i = 0; i < 37; i++) {
      la1tokens[i] = false;
    }
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 20; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 37; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.addElement(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = (int[])jj_expentries.elementAt(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  final public void enable_tracing() {
  }

  final public void disable_tracing() {
  }

}
