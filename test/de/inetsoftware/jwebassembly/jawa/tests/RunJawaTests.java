/* This file is generated by GenerateTests.java. Please do not modify. */
/*
 * Copyright 2017 - 2020 Volker Berlin (i-net software)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.inetsoftware.jwebassembly.jawa.tests;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static de.inetsoftware.jwebassembly.jawa.tests.TestRunner.run;
import de.inetsoftware.jwebassembly.jawa.tests.unit.*;

import java.io.File;

public class RunJawaTests {

    final static boolean isWindows = System.getProperty("os.name").toLowerCase().contains("win");
    final static String SEPARATOR = isWindows ? "\\" : "/";

    @BeforeClass
    public static void setup() {
        File directory = new File("build" + SEPARATOR + "code");
        if (! directory.exists()){
            directory.mkdirs();
        }
    }

    @Test
    public void add01() { run( add01.class ); }

    @Test
    public void add02() { run( add02.class ); }

    @Test
    public void aiobe00() { run( aiobe00.class ); }

    @Test
    public void aiobe01() { run( aiobe01.class ); }

    @Test
    public void aiobe02() { run( aiobe02.class ); }

    @Test
    public void alloc_loop00() { run( alloc_loop00.class ); }

    @Test
    public void alloc_loop01() { run( alloc_loop01.class ); }

    @Test
    public void andand00() { run( andand00.class ); }

    @Test
    public void andand01() { run( andand01.class ); }

    @Test
    public void andand02() { run( andand02.class ); }

    @Test
    public void andand03() { run( andand03.class ); }

    @Test
    public void andand04() { run( andand04.class ); }

    @Test
    public void args00() { run( args00.class ); }

    @Test
    public void args01() { run( args01.class ); }

    @Test
    public void args02() { run( args02.class ); }

    @Test
    public void args03() { run( args03.class ); }

    @Test
    public void args04() { run( args04.class ); }

    @Test
    public void args05() { run( args05.class ); }

    @Test
    public void args06() { run( args06.class ); }

    @Test
    public void args07() { run( args07.class ); }

    @Test
    public void args08() { run( args08.class ); }

    @Test
    public void args09() { run( args09.class ); }

    @Test
    public void array00() { run( array00.class ); }

    @Test
    public void array01() { run( array01.class ); }

    @Test
    public void array02() { run( array02.class ); }

    @Test
    public void array03() { run( array03.class ); }

    @Test
    public void array04() { run( array04.class ); }

    @Test
    public void array05() { run( array05.class ); }

    @Test
    public void array06() { run( array06.class ); }

    @Test
    public void array07() { run( array07.class ); }

    @Test
    public void arraylength00() { run( arraylength00.class ); }

    @Test
    public void array_copy01() { run( array_copy01.class ); }

    @Test
    public void callstatic() { run( callstatic.class ); }

    @Test
    public void char00() { run( char00.class ); }

    @Test
    public void checkcast00() { run( checkcast00.class ); }

    @Test
    public void checkcast01() { run( checkcast01.class ); }

    @Test
    public void div01() { run( div01.class ); }

    @Test
    public void divzero01() { run( divzero01.class ); }

    @Test
    public void eq00() { run( eq00.class ); }

    @Test
    public void eq01() { run( eq01.class ); }

    @Test
    public void eq02() { run( eq02.class ); }

    @Test
    public void eq03() { run( eq03.class ); }

    @Test
    public void except00() { run( except00.class ); }

    @Test
    public void false00() { run( false00.class ); }

    @Test
    public void fieldstatic() { run( fieldstatic.class ); }

    @Test
    public void for00() { run( for00.class ); }

    @Test
    public void for01() { run( for01.class ); }

    @Test
    public void for02() { run( for02.class ); }

    @Test
    public void for03() { run( for03.class ); }

    @Test
    public void for04() { run( for04.class ); }

    @Test
    public void for05() { run( for05.class ); }

    @Test
    public void for06() { run( for06.class ); }

    @Test
    public void for07() { run( for07.class ); }

    @Test
    public void for08() { run( for08.class ); }

    @Test
    public void for09() { run( for09.class ); }

    @Test
    public void for10() { run( for10.class ); }

    @Test
    public void for11() { run( for11.class ); }

    @Test
    public void for12() { run( for12.class ); }

    @Test
    public void for13() { run( for13.class ); }

    @Test
    public void for14() { run( for14.class ); }

    @Test
    public void for15() { run( for15.class ); }

    @Test
    public void gt00() { run( gt00.class ); }

    @Test
    public void gt01() { run( gt01.class ); }

    @Test
    public void gt02() { run( gt02.class ); }

    @Test
    public void gteq00() { run( gteq00.class ); }

    @Test
    public void gteq01() { run( gteq01.class ); }

    @Test
    public void gteq02() { run( gteq02.class ); }

    @Test
    public void if01() { run( if01.class ); }

    @Test
    public void if02() { run( if02.class ); }

    @Test
    public void if03() { run( if03.class ); }

    @Test
    public void instance_field01() { run( instance_field01.class ); }

    @Test
    public void instance_field02() { run( instance_field02.class ); }

    @Test
    public void instance_field03() { run( instance_field03.class ); }

    @Test
    public void instance_field04() { run( instance_field04.class ); }

    @Test
    public void instance_field05() { run( instance_field05.class ); }

    @Test
    public void instance_field06() { run( instance_field06.class ); }

    @Test
    public void instance_field07() { run( instance_field07.class ); }

    @Test
    public void instance_meth00() { run( instance_meth00.class ); }

    @Test
    public void instance_meth01() { run( instance_meth01.class ); }

    @Test
    public void instance_meth02() { run( instance_meth02.class ); }

    @Test
    public void int00() { run( int00.class ); }

    @Test
    public void interface00() { run( interface00.class ); }

    @Test
    public void lt00() { run( lt00.class ); }

    @Test
    public void lt01() { run( lt01.class ); }

    @Test
    public void lt02() { run( lt02.class ); }

    @Test
    public void lteq00() { run( lteq00.class ); }

    @Test
    public void lteq01() { run( lteq01.class ); }

    @Test
    public void lteq02() { run( lteq02.class ); }

    @Test
    public void math00() { run( math00.class ); }

    @Test
    public void mul01() { run( mul01.class ); }

    @Test
    public void ne00() { run( ne00.class ); }

    @Test
    public void ne01() { run( ne01.class ); }

    @Test
    public void ne02() { run( ne02.class ); }

    @Test
    public void ne03() { run( ne03.class ); }

    @Test
    public void new_array01() { run( new_array01.class ); }

    @Test
    public void npe01() { run( npe01.class ); }

    @Test
    public void npe02() { run( npe02.class ); }

    @Test
    public void npe03() { run( npe03.class ); }

    @Test
    public void null00() { run( null00.class ); }

    @Test
    public void null01() { run( null01.class ); }

    @Test
    public void null02() { run( null02.class ); }

    @Test
    public void oror00() { run( oror00.class ); }

    @Test
    public void oror01() { run( oror01.class ); }

    @Test
    public void oror02() { run( oror02.class ); }

    @Test
    public void oror03() { run( oror03.class ); }

    @Test
    public void oror04() { run( oror04.class ); }

    @Test
    public void print00() { run( print00.class ); }

    @Test
    public void ret01() { run( ret01.class ); }

    @Test
    public void ret02() { run( ret02.class ); }

    @Test
    public void ret03() { run( ret03.class ); }

    @Test
    public void ret04() { run( ret04.class ); }

    @Test
    public void ret05() { run( ret05.class ); }

    @Test
    public void ret06() { run( ret06.class ); }

    @Test
    public void return00() { run( return00.class ); }

    @Test
    public void static_call01() { run( static_call01.class ); }

    @Test
    public void static_call02() { run( static_call02.class ); }

    @Test
    public void static_call03() { run( static_call03.class ); }

    @Test
    public void static_field01() { run( static_field01.class ); }

    @Test
    public void static_field02() { run( static_field02.class ); }

    @Test
    public void static_field03() { run( static_field03.class ); }

    @Test
    public void static_field04() { run( static_field04.class ); }

    @Test
    public void static_field05() { run( static_field05.class ); }

    @Test
    public void str00() { run( str00.class ); }

    @Test
    public void str01() { run( str01.class ); }

    @Test
    public void str02() { run( str02.class ); }

    @Test
    public void str03() { run( str03.class ); }

    @Test
    public void sub01() { run( sub01.class ); }

    @Test
    public void super01() { run( super01.class ); }

    @Test
    public void super02() { run( super02.class ); }

    @Test
    public void super_meth00() { run( super_meth00.class ); }

    @Test
    public void super_meth01() { run( super_meth01.class ); }

    @Test
    public void syscall01() { run( syscall01.class ); }

    @Test
    public void this00() { run( this00.class ); }

    @Test
    public void throw00() { run( throw00.class ); }

    @Test
    public void true00() { run( true00.class ); }

    @Test
    public void var00() { run( var00.class ); }

    @Test
    public void var01() { run( var01.class ); }

    @Test
    public void var02() { run( var02.class ); }

    @Test
    public void var03() { run( var03.class ); }

    @Test
    public void var04() { run( var04.class ); }

    @Test
    public void var05() { run( var05.class ); }

    @Test
    public void virtual00() { run( virtual00.class ); }

    @Test
    public void virtual01() { run( virtual01.class ); }

    @Test
    public void virtual02() { run( virtual02.class ); }

    @Test
    public void virtual03() { run( virtual03.class ); }

    @Test
    public void virtual04() { run( virtual04.class ); }

    @Test
    public void virtual05() { run( virtual05.class ); }

    @Test
    public void virtual06() { run( virtual06.class ); }

    @Test
    public void virtual07() { run( virtual07.class ); }

    @Test
    public void virtual08() { run( virtual08.class ); }

    @Test
    public void virtual09() { run( virtual09.class ); }

    @Test
    public void virtual10() { run( virtual10.class ); }

    @Test
    public void while00() { run( while00.class ); }

    @Test
    public void while01() { run( while01.class ); }

    @Test
    public void while02() { run( while02.class ); }

    @Test
    public void while03() { run( while03.class ); }

    @Test
    public void while04() { run( while04.class ); }

    @Test
    public void while05() { run( while05.class ); }

    @Test
    public void xc_array01() { run( xc_array01.class ); }

    @Test
    public void xc_array02() { run( xc_array02.class ); }

    @Test
    public void xc_array03() { run( xc_array03.class ); }

    @Test
    public void xc_break01() { run( xc_break01.class ); }

    @Test
    public void xc_break02() { run( xc_break02.class ); }

    @Test
    public void xc_break03() { run( xc_break03.class ); }

    @Test
    public void xc_break04() { run( xc_break04.class ); }

    @Test
    public void xc_cont01() { run( xc_cont01.class ); }

    @Test
    public void xc_cont02() { run( xc_cont02.class ); }

    @Test
    public void xc_cont03() { run( xc_cont03.class ); }

    @Test
    public void xc_superfield00() { run( xc_superfield00.class ); }



}
