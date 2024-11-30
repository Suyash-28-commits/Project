package Network;
import java.util.*;
import java.util.List;

import javax.swing.*;
import java.awt.*;
public class Metro {
    public static class MetroNetwork{
        public MetroNetwork(){//Constructor for creating a MetroNetwork

        }
        public static class Edge{ //Edge or Connection between two stations
            String src;//source
            String dest;//destination

            public Edge(String s,String d){//Constructor for creating an edge
                this.src = s;
                this.dest = d;
            }
        }

        public static class Path{//Path between two stations
            //Path consists of short and long path
            String s; //short path
            String l; //long path

            public Path(String s,String l){ //constructor for creating path
                this.s = s;
                this.l = l;
            }
        }
        
        //Creation of whole Delhi Metro Network using Graphs Data Structure
        //Graph using Edge List ->list of all edges of graph or metro network
        public static LinkedList<Edge>graph = new LinkedList<>();

        //creating the metro network 
        public static void createNetwork(){
            //Red Line
            graph.add(new Edge("Shaheed Sthal(New Bus Adda)","Hindon River")); //Shaheed Sthal

            graph.add(new Edge("Hindon River","Shaheed Sthal(New Bus Adda)")); //Hindon River
            graph.add(new Edge("Hindon River","Arthala"));

            graph.add(new Edge("Arthala","Mohan Nagar")); //Arthala
            graph.add(new Edge("Arthala","Hindon River"));

            graph.add(new Edge("Mohan Nagar","Shyam Park"));//Mohan Nagar
            graph.add(new Edge("Mohan Nagar","Arthala"));

            graph.add(new Edge("Shyam Park","Major Mohit Sharma Rajendra Nagar")); //Shyam Park
            graph.add(new Edge("Shyam Park","Mohan Nagar"));

            graph.add(new Edge("Major Mohit Sharma Rajendra Nagar","Raj Bagh"));//Major Mohit Sharma Rajendra Nagar
            graph.add(new Edge("Major Mohit Sharma Rajendra Nagar","Shya, Park"));

            graph.add(new Edge("Raj Bagh","Shaheed Nagar")); //Raj Bagh
            graph.add(new Edge("Raj Bagh","Major Mohit Sharma Rajendra Nagar"));

            graph.add(new Edge("Shaheed Nagar","Dilshad Garden"));//Shaheed Nagar
            graph.add(new Edge("Shaheed Nagar","Raj Bagh"));

            graph.add(new Edge("Dilshad Garden","Jhilmil")); //Dilshad Garden
            graph.add(new Edge("Dilshad Garden","Shaheed Nagar"));

            graph.add(new Edge("Jhilmil","Mansarovar Park"));//Jhilmil
            graph.add(new Edge("Jhilmil","Dilshad Garden"));

            graph.add(new Edge("Mansarovar Park","Shahdra"));//Mansarovar Park
            graph.add(new Edge("Mansarovar Park","Jhilmil"));

            graph.add(new Edge("Shahdra","Welcome"));//Shahdra
            graph.add(new Edge("Shahdra","Mansarovar Park"));

            graph.add(new Edge("Welcome","Shahdra"));//Welcome
            graph.add(new Edge("Welcome","Seelampur"));
            
            graph.add(new Edge("Seelampur","Welcome"));//Seelmapur
            graph.add(new Edge("Seelampur","Shastri Park"));

            graph.add(new Edge("Shastri Park","Seelampur"));//Shastri Park
            graph.add(new Edge("Shastri Park","Kashmere Gate"));

            graph.add(new Edge("Kashmere Gate","Shastri Park"));//Kashmere Gate
            graph.add(new Edge("Kashmere Gate","Tis Hazari"));
        
            graph.add(new Edge("Tis Hazari","Pulbangash")); //Tis Hazari
            graph.add(new Edge("Tis Hazari","Kashmere Gate"));

            graph.add(new Edge("Pulbangash","Tis Hazari")); //Pulbangash
            graph.add(new Edge("Pulbangash","Pratap Nagar"));

            graph.add(new Edge("Paratap Nagar","Shastri Nagar"));//Pratap Nagar
            graph.add(new Edge("Paratap Nagar","Pulbangash"));

            graph.add(new Edge("Shastri Nagar","Inderlok"));//Shastri Nagar
            graph.add(new Edge("Shastri Nagar","Pratap Nagar"));

            graph.add(new Edge("Inderlok","Shastri Nagar"));//Inderlok
            graph.add(new Edge("Inderlok","Kanhaiya Nagar"));

            graph.add(new Edge("Kanhaiya Nagar","Inderlok"));//Kanhaiya Nagar
            graph.add(new Edge("Kanhaiya Nagar","Keshav Puram"));

            graph.add(new Edge("Keshav Puram","Kanhaiya Nagar")); //Keshav Puram
            graph.add(new Edge("Keshav Puram","Netaji Subhash Place"));

            graph.add(new Edge("Netaji Subhash Place","Keshav Puram"));//Netaji Subhash Place
            graph.add(new Edge("Netaji Subhash Place","Kohat Enclave"));

            graph.add(new Edge("Kohat Enclave","Netaji Subhash Place"));//Kohat Enclave
            graph.add(new Edge("Kohat Enclave","Pitampura"));

            graph.add(new Edge("Pitampura","Rohini East"));//Pitampura
            graph.add(new Edge("Pitampura","Kohat Enclave"));

            graph.add(new Edge("Rohini East","Pitampura"));//Rohini East
            graph.add(new Edge("Rohini East","Rohini West"));

            graph.add(new Edge("Rohini West","Rithala")); //Rohini West
            graph.add(new Edge("Rohini West","Rithala"));

            graph.add(new Edge("Rithala","Rohini West")); //Rithala

            //Blue Line
            graph.add(new Edge("Vaishali","Kaushambi")); //Vaishali

            graph.add(new Edge("Kaushambi","Vaishali"));//Kaushambi
            graph.add(new Edge("Kaushambi","Anand Vihar"));

            graph.add(new Edge("Anand Vihar","Kaushambi")); //Anand Vihar
            graph.add(new Edge("Anand Vihar","Karkardooma"));
           
            graph.add(new Edge("Karkardooma","Anand Vihar"));//Karkardooma
            graph.add(new Edge("Karkardooma","Preet Vihar"));
           
            graph.add(new Edge("Preet Vihar","Karkardooma"));//Preet Vihar
            graph.add(new Edge("Preet Vihar","Nirman Vihar"));

            graph.add(new Edge("Nirman Vihar","Laxmi Nagar")); //Nirman Vihar
            graph.add(new Edge("Nirman Vihar","Preet Vihar"));

            graph.add(new Edge("Laxmi Nagar","Yamuna Bank")); //Laxmi Nagar
            graph.add(new Edge("Laxmi Nagar","Nirman Vihar"));

            graph.add(new Edge("Yamuna Bank","Laxmi Nagar")); //Yamuna Bank
            graph.add(new Edge("Laxmi Nagar","Akshardham"));
            graph.add(new Edge("Laxmi Nagar","Indraprastha"));

            graph.add(new Edge("Akshardham","Yamuna Bank")); //Akshardham
            graph.add(new Edge("Akshardham","Mayur Vihar 1"));

            graph.add(new Edge("Mayur Vihar 1","Askshardham")); //Mayur Vihar - 1
            graph.add(new Edge("Mayur Vihar 1","Mayur Vihar Extension"));

            graph.add(new Edge("Mayur Vihar Extension","Mayur Vihar 1"));//Mayur Vihar Extension
            graph.add(new Edge("Mayur Vihar Extension","New Ashok Nagar"));

            graph.add(new Edge("New Ashok Nagar","Mayur Vihar Extension"));//New Ashok Nagar
            graph.add(new Edge("New Ashok Nagar","Noida Sector 15"));

            graph.add(new Edge("Noida Sector 15","Noida Sector 16"));//Noida Sector 15
            graph.add(new Edge("Noida Sector 15","Ashok Nagar"));

            graph.add(new Edge("Noida Sector 16","Noida Sector 15"));//Noida Sector 16
            graph.add(new Edge("Noida Sector 16","Noida Sector 18"));

            graph.add(new Edge("Noida Sector 18","Botanical Garden"));//Noida Sector 18
            graph.add(new Edge("Noida Sector 18","Noida Sector 16"));

            graph.add(new Edge("Botanical Garden","Noida Secor-18")); //Botanical Garden
            graph.add(new Edge("Botanical Garden","Golf Course"));

            graph.add(new Edge("Golf Course","Botanical Garden"));//Golf Course
            graph.add(new Edge("Golf Course","Noida City Centre "));

            graph.add(new Edge("Noida City Centre","Sector-34 Noida"));//Noida City Centre
            graph.add(new Edge("Noida City Centre","Golf Course"));

            graph.add(new Edge("Sector-34 Noida","Noida City Centre"));//Sector-34 Noida
            graph.add(new Edge("Sector-34 Noida","Sector-52 Noida"));

            graph.add(new Edge("Sector-52 Noida","Sector-34 Noida"));//Sector-52 Noida
            graph.add(new Edge("Sector-52 Noida","Sector-61 Noida"));
            graph.add(new Edge("Sector-52 Noida","Sector-51"));


            graph.add(new Edge("Sector-61 Noida","Sector-52 Noida"));//Sector-61 Noida
            graph.add(new Edge("Sector-61 Noida","Sector-59 Noida"));

            graph.add(new Edge("Sector-59 Noida","Sector-61 Noida"));//Sector-59 Noida
            graph.add(new Edge("Sector-59 Noida","Sector-62 Noida"));
            
            graph.add(new Edge("Sector-62 Noida","Sector-59 Noida"));//Sector-62 Noida
            graph.add(new Edge("Sector-62 Noida","Noida Electronic City"));

            graph.add(new Edge("Noida Electronic City","Sector-62 Noida"));//Noida Electronic City

            graph.add(new Edge("Indraprastha","Yamuna Bank"));//Indraprastha
            graph.add(new Edge("Indraprastha","Supreme Court"));

            graph.add(new Edge("Supreme Court","Indraprastha"));//Supreme Court
            graph.add(new Edge("Supreme Court","Mandi House"));

            graph.add(new Edge("Mandi House","Supreme Court"));//Mandi House
            graph.add(new Edge("Mandi House","Barakhamba Road"));

            graph.add(new Edge("Barakhamba Road","Mandi House"));//Barakhamba Road
            graph.add(new Edge("Barakhamba Road","Rajiv Chowk"));

            graph.add(new Edge("Rajiv Chowk","Barakhamba Road"));//Rajiv Chowk
            graph.add(new Edge("Rajiv Chowk","Ramakrishna Ashram Marg"));

            graph.add(new Edge("Ramakrishna Ashram Marg","Rajiv Chowk"));//Ramakrishna Ashram Marg
            graph.add(new Edge("Ramakrishna Ashram Marg","Jhandewalan"));

            graph.add(new Edge("Jhandewalan","Ramakrishna Ashram Marg"));//Jhandewalan
            graph.add(new Edge("Jhandewalan","Karol Bagh"));

            graph.add(new Edge("Karol Bagh","Jhandewalan"));//Karol Bagh
            graph.add(new Edge("Karol Bagh","Rajendra Place"));

            graph.add(new Edge("Rajendra Place","Karol Bagh"));//Rajendra Place
            graph.add(new Edge("Rajendra Place","Patel Nagar"));

            graph.add(new Edge("Patel Nagar","Rajendra Place"));//Patel Nagar
            graph.add(new Edge("Patel Nagar","Shadipur"));

            graph.add(new Edge("Shadipur","Patel Nagar"));//Shadipur
            graph.add(new Edge("Shadipur","Kirti Nagar"));

            graph.add(new Edge("Kirti Nagar","Shadipur"));//Kirti Nagar
            graph.add(new Edge("Kirti Nagar","Moti Nagar"));

            graph.add(new Edge("Moti Nagar","Kirti Nagar"));//Moti Nagar
            graph.add(new Edge("Moti Nagar","Ramesh Nagar"));

            graph.add(new Edge("Ramesh Nagar","Moti Nagar"));//Ramesh Nagar
            graph.add(new Edge("Ramesh Nagar","Rajouri Garden"));

            graph.add(new Edge("Rajouri Garden","Ramesh Nagar"));//Rajouri Garden
            graph.add(new Edge("Rajouri Garden","Tagore Garden"));

            graph.add(new Edge("Tagore Garden","Rajouri Garden"));//Tagore Garden
            graph.add(new Edge("Tagore Garden","Subhash Nagar"));

            graph.add(new Edge("Subhash Nagar","Tagore Garden"));//Subhash Nagar
            graph.add(new Edge("Subhash Nagar","Tilak Nagar"));

            graph.add(new Edge("Tilak Nagar","Subhash Nagar"));//Tilak Nagar
            graph.add(new Edge("Tilak Nagar","Janakpuri East"));

            graph.add(new Edge("Janakpuri East","Tilak Nagar"));//Janakpuri East
            graph.add(new Edge("Janakpuri East","Janakpuri West"));
            
            graph.add(new Edge("Janakpuri West","Janakpuri East"));//Janakpuri West
            graph.add(new Edge("Janakpuri West","Uttam Nagar East"));

            graph.add(new Edge("Uttam Nagar East","Janakpuri West"));//Uttam Nagar East
            graph.add(new Edge("Uttam Nagar East","Uttam Nagar West"));

            graph.add(new Edge("Uttam Nagar West","Uttam Nagar East"));//Uttam Nagar West
            graph.add(new Edge("Uttam Nagar West","Nawada"));

            graph.add(new Edge("Nawada","Uttam Nagar West"));//Nawada
            graph.add(new Edge("Nawada","Dwarka Mor"));

            graph.add(new Edge("Dwarka Mor","Nawada"));//Dwarka Mor
            graph.add(new Edge("Dwarka Mor","Dwarka"));

            graph.add(new Edge("Dwarka","Dwarka Mor"));//Dwarka
            graph.add(new Edge("Dwarka","Dwarka Sector-14"));

            graph.add(new Edge("Dwarka Sector-14","Dwarka"));//Dwarka Sector-14
            graph.add(new Edge("Dwarka Sector-14","Dwarka Sector-13"));

            graph.add(new Edge("Dwarka Sector-13","Dwarka Sector-14"));//Dwarka Sector-13
            graph.add(new Edge("Dwarka Sector-13","Dwarka Sector-12"));

            graph.add(new Edge("Dwarka Sector-12","Dwarka Sector-13"));//Dwarka Sector-12
            graph.add(new Edge("Dwarka Sector-12","Dwarka Sector-11"));

            graph.add(new Edge("Dwarka Sector-11","Dwarka Sector-12"));//Dwarka Sector-11
            graph.add(new Edge("Dwarka Sector-11","Dwarka Sector-10"));

            graph.add(new Edge("Dwarka Sector-10","Dwarka Sector-11"));//Dwarka Sector-10
            graph.add(new Edge("Dwarka Sector-10","Dwarka Sector-9"));

            graph.add(new Edge("Dwarka Sector-9","Dwarka Sector-10"));//Dwarka Sector-9
            graph.add(new Edge("Dwarka Sector-9","Dwarka Sector-8"));

            graph.add(new Edge("Dwarka Sector-8","Dwarka Sector-21"));//Dwarka Sector-8
            graph.add(new Edge("Dwarka Sector-8","Dwarka Sector-9"));

            //Violet Line
            graph.add(new Edge("Kashmere Gate","Lal Quila"));//Kashmere Gate
            graph.add(new Edge("Lal Quila","Kashmere Gate"));//Lal Quila
            graph.add(new Edge("Lal Quila","Jama Masjid"));

            graph.add(new Edge("Jama Masjid","Lal Quila"));//Jama Masjid
            graph.add(new Edge("Jama Masjid","Delhi Gate"));

            graph.add(new Edge("Delhi Gate","Jama Masjid"));//Delhi Gate
            graph.add(new Edge("Delhi Gate","ITO"));

            graph.add(new Edge("ITO","Delhi Gate"));//ITO
            graph.add(new Edge("ITO","Mandi House"));

            graph.add(new Edge("Mandi House","ITO"));//Mandi House
            graph.add(new Edge("Mandi House","Janpath"));

            graph.add(new Edge("Janpath","Mandi House"));//Janpath
            graph.add(new Edge("Janpath","Central Secretariat"));

            graph.add(new Edge("Central Secretariat","Janpath"));//Central Secretariat
            graph.add(new Edge("Central Secretariat","Khan Market"));

            graph.add(new Edge("Khan Market","Central Secretariat"));//Khan Market
            graph.add(new Edge("Khan Market","JLN Stadium"));//Khan Market

            graph.add(new Edge("JLN Stadium","Khan Market"));//JLN Stadium
            graph.add(new Edge("JLN Stadium","Jangpura"));

            graph.add(new Edge("Jangpura","JLN Stadium"));//Jangpura
            graph.add(new Edge("Jangpura","Lajpat Nagar"));

            graph.add(new Edge("Lajpat Nagar","Jangpura"));//Lajpat Nagar
            graph.add(new Edge("Lajpat Nagar","Moolchand"));

            graph.add(new Edge("Moolchand","Lajpat Nagar"));//Moolchand
            graph.add(new Edge("Moolchand","Kailash Colony"));

            graph.add(new Edge("Kailash Colony","Moolchand"));//Kailash Colony
            graph.add(new Edge("Kailash Colony","Nehru Place"));

            graph.add(new Edge("Nehru Place","Kailash Colony"));//Nehru Place
            graph.add(new Edge("Nehru Place","Kalkaji Mandir"));

            graph.add(new Edge("Kalkaji Mandir","Nehru Place"));//Kalkaji Mandir
            graph.add(new Edge("Kalkaji Mandir","Govind Puri"));

            graph.add(new Edge("Govind Puri","Kalkaji Mandir"));//Govind Puri
            graph.add(new Edge("Govind Puri","Harkesh Nagar Okhla"));
            
            graph.add(new Edge("Harkesh Nagar Okhla","Govind Puri"));//Harkesh Nagar Okhla
            graph.add(new Edge("Harkesh Nagar Okhla","Jasola-Apollo"));

            graph.add(new Edge("Jasola-Apollo","Sarita Vihar"));//Jasola-Apollo
            graph.add(new Edge("Jasola-Apollo","Harkesh Nagar Okhla"));

            graph.add(new Edge("Sarita Vihar","Jasola-Apollo"));//Sarita Vihar
            graph.add(new Edge("Sarita Vihar","Mohan Estate"));

            graph.add(new Edge("Mohan Estate","Sarita Vihar"));//Mohan Estate
            graph.add(new Edge("Mohan Estate","Tughlakabad Station"));

            graph.add(new Edge("Tughlakabad Station","Mohan Estate"));//Tughlakabad Station
            graph.add(new Edge("Tughlakabad Station","Badarpur Border"));

            graph.add(new Edge("Badarpur Border","Tughlakabad Station"));//BadarPur Border
            graph.add(new Edge("Badarpur Border","Sarai"));//BadarPur Border

            graph.add(new Edge("Sarai","Badarpur Border"));//Sarai
            graph.add(new Edge("Sarai","NHPC Chowk"));

            graph.add(new Edge("NHPC Chowk","Sarai"));//NHPC Chowk
            graph.add(new Edge("NHPC Chowk","Mewala Maharajpur"));//NHPC Chowk

            graph.add(new Edge("Mewala Maharajpur","NHPC Chowk"));//Mewala Maharajpur
            graph.add(new Edge("Mewala Maharajpur","Sector-28"));

            graph.add(new Edge("Sector-28","Mewala Maharajpur"));//Sector-28
            graph.add(new Edge("Sector-28","Badkal Mor"));
            
            graph.add(new Edge("Badkal Mor","Sector-28"));//Badkal Mor
            graph.add(new Edge("Badkal Mor","Old Faridabad"));

            graph.add(new Edge("Old Faridabad","Badkal Mor"));//Old Faridabad
            graph.add(new Edge("Old Faridabad","Neelam Chowk Arjonda"));

            graph.add(new Edge("Neelam Chowk Arjonda","Old Faridabad"));//Neelam Chowk Arjonda
            graph.add(new Edge("Neelam Chowk Arjonda","Bata Chowk"));

            graph.add(new Edge("Bata Chowk","Neelam Chowk Arjonda"));//Bata Chowk
            graph.add(new Edge("Bata Chowk","Escorts Mujesar"));

            graph.add(new Edge("Escorts Mujesar","Bata Chowk"));//Escorts Mujesar
            graph.add(new Edge("Escorts Mujesar","Sant Surdas(Sihi)"));

            graph.add(new Edge("Sant Surdas(Sihi)","Escorts Mujesar"));//Sant Surdas(Sihi)
            graph.add(new Edge("Sant Surdas(Sihi)","Raja Nahar Singh(Ballabgarh)"));

            graph.add(new Edge("Raja Nahar Singh(Ballabgarh)","Sant Surdas(Sihi)"));//Raja Nahar Singh(Ballabgarh)

            //Grey Line
            graph.add(new Edge("Dwarka","Nangli"));//Dwarka

            graph.add(new Edge("Nangli","Dwarka")); //Nangli
            graph.add(new Edge("Nangli","Najafgarh"));

            graph.add(new Edge("Najafgarh","Nangli"));//Najafgarh
            graph.add(new Edge("Najafgarh","Dhansa Bus Stand"));

            graph.add(new Edge("Dhansa Bus Stand","Najafgarh"));//Dhansa Bus Stand

            //Green Line
            graph.add(new Edge("Inderlok","Ashok Park Main"));//Inderlok

            graph.add(new Edge("Ashok Park Main","Inderlok"));//Ashok Park Main
            graph.add(new Edge("Ashok Park Main","Punjabi Bagh"));
            graph.add(new Edge("Ashok Park Main","Satguru Ram Singh Marg"));

            graph.add(new Edge("Satguru Ram Singh Marg","Ashok Park Main"));//Satguru Ram Singh Marg
            graph.add(new Edge("Satguru Ram Singh Marg","Kirti Nagar"));//Satguru Ram Singh Marg

            graph.add(new Edge("Kirti Nagar","Satguru Ram Singh Marg"));//Kirti Nagar

            graph.add(new Edge("Punjabi Bagh","Ashok Park Main"));//Punjabi Bagh
            graph.add(new Edge("Punjabi Bagh","Punjabi Bagh West"));//Punjabi Bagh

            graph.add(new Edge("Punjabi Bagh West","Punjabi Bagh"));//Punjabi Bagh West
            graph.add(new Edge("Punjabi Bagh West","Shivaji Park"));

            graph.add(new Edge("Shivaji Park","Punjabi Bagh West"));//Shivaji Park
            graph.add(new Edge("Shivaji Park","Madipur"));

            graph.add(new Edge("Madipur","Shivaji Park"));//Madipur
            graph.add(new Edge("Madipur","Paschim Vihar East"));

            graph.add(new Edge("Paschim Vihar East","Paschim Vihar West"));//Paschim Vihar East
            graph.add(new Edge("Paschim Vihar East","Madipur"));

            graph.add(new Edge("Paschim Vihar West","Paschim Vihar East"));//Paschim Vihar West
            graph.add(new Edge("Paschim Vihar West","Peeragarhi"));

            graph.add(new Edge("Peeragarhi","Paschim Vihar West"));//Peeragarhi
            graph.add(new Edge("Peeragarhi","Udyog Nagar"));

            graph.add(new Edge("Udyog Nagar","Peeragarhi"));//Udyog Nagar
            graph.add(new Edge("Udyog Nagar","Maharaja Surajmal Stadium"));

            graph.add(new Edge("Maharaja Surajmal Stadium","Udyog Nagar"));//Maharaja Surajmal Stadium
            graph.add(new Edge("Maharaja Surajmal Stadium","Nangloi"));

            graph.add(new Edge("Nangloi","Nangloi Railway Station"));//Nangloi
            graph.add(new Edge("Nangloi","Maharaja Surajmal Stadium"));

            graph.add(new Edge("Nangloi Railway Station","Nangloi"));//Nangloi Railway Station
            graph.add(new Edge("Nangloi Railway Station","Rajdhani Park"));

            graph.add(new Edge("Rajdhani Park","Nangloi Railway Station"));//Rajdhani Park
            graph.add(new Edge("Rajdhani Park","Mundka"));

            graph.add(new Edge("Mundka","Rajdhani Park"));//Mundka
            graph.add(new Edge("Mundka","Mundka Industrial Area(Mia)"));

            graph.add(new Edge("Mundka Industrial Area(Mia)","Mundka"));//Mundka Industrial Area(Mia)
            graph.add(new Edge("Mundka Industrial Area(Mia)","Ghevra Metro Station"));

            graph.add(new Edge("Ghevra Metro Station","Mundka Industrial Area(Mia)"));//Ghevra Metro Station
            graph.add(new Edge("Ghevra Metro Station","Tikri Kalan"));
            
            graph.add(new Edge("Tikri Kalan","Ghevra Metro Station"));//Tikri Kalan
            graph.add(new Edge("Tikri Kalan","Tikri Border"));

            graph.add(new Edge("Tikri Border","Tikri Kalan"));//Tikri Border
            graph.add(new Edge("Tikri Border","Pandit Shree Ram Sharma"));
            
            graph.add(new Edge("Pandit Shree Ram Sharma","Tikri Border"));//Pandit Shree Ram Sharma
            graph.add(new Edge("Pandit Shree Ram Sharma","Bhadurgarh City"));

            graph.add(new Edge("Bhadurgarh City","Pandit Shree Ram Sharma"));//Bhadurgarh City
            graph.add(new Edge("Bhadurgarh City","Brigadier Hoshiyar Singh"));

            graph.add(new Edge("Brigadier Hoshiyar Singh","Bhadurgarh City"));//Brigadier Hoshiyar Singh

            //Orange Line ->Airport Expressway Metro Line
            graph.add(new Edge("New Delhi","Shivaji Stadium"));//New Delhi

            graph.add(new Edge("Shivaji Stadium","New Delhi"));//Shivaji Stadium
            graph.add(new Edge("Shivaji Stadium","Dhaula  Kuan"));

            graph.add(new Edge("Dhaula Kuan","Shivaji Stadium"));//Dhaula Kuan
            graph.add(new Edge("Dhaula Kuan","Delhi Aerocity"));
            graph.add(new Edge("Dhaula Kuan","Durgabai Deshmukh South Campus"));


            graph.add(new Edge("Delhi Aerocity","Dhaula Kuan"));//Delhi Aerocity
            graph.add(new Edge("Delhi Aerocity","Airport (T-3)"));

            graph.add(new Edge("Airport (T-3)","Delhi Aerocity"));//Airport (T-3)
            graph.add(new Edge("Airport (T-3)","Dwarka Sector-21"));

            graph.add(new Edge("Dwarka Sector-21","Airport (T-3)"));//Dwarka Sector-21
            graph.add(new Edge("Dwarka Sector-21","Yashobhoomi Dwarka Sector-25"));

            graph.add(new Edge("Yashobhoomi Dwarka Sector-25","Dwarka Sector-21"));//Yashobhoomi Dwarka Sector-25

            //Yellow Line
            graph.add(new Edge("Samaypur Badli","Rohini Sector-18,19"));//Samaypur Badli

            graph.add(new Edge("Rohini Sector-18,19","Samaypur Badli"));//Rohini Sector-18,19
            graph.add(new Edge("Rohini Sector-18,19","Haiderpur Badli Mor"));

            graph.add(new Edge("Haiderpur Badli Mor","Rohini Sector-18,19"));//Haiderpur Badli Mor
            graph.add(new Edge("Haiderpur Badli Mor","Jahangirpuri"));

            graph.add(new Edge("Jahangirpuri","Haiderpur Badli Mor"));//Jahangirpuri
            graph.add(new Edge("Jahangirpuri","Adarsh Nagar"));

            graph.add(new Edge("Adarsh Nagar","Jahangirpuri"));//Adarsh Nagar
            graph.add(new Edge("Adarsh Nagar","Azadpur"));

            graph.add(new Edge("Azadpur","Adarsh Nagar"));//Azadpur
            graph.add(new Edge("Azadpur","Model Town"));

            graph.add(new Edge("Model Town","Azadpur"));//Model Town
            graph.add(new Edge("Model Town","Guru Teg Bahadur Nagar"));

            graph.add(new Edge("Guru Teg Bahadur Nagar","Model Town"));//Guru Teg Bahadur Nagar
            graph.add(new Edge("Guru Teg Bahadur Nagar","Vishwavidyalaya"));

            graph.add(new Edge("Vishwavidyalaya","Guru Teg Bahadur Nagar"));//"Vishwavidyalaya
            graph.add(new Edge("Vishwavidyalaya","Vidhan Sabha"));

            graph.add(new Edge("Vidhan Sabha","Vishwavidyalaya"));//Vidhan Sabha
            graph.add(new Edge("Vidhan Sabha","Civil Lines"));

            graph.add(new Edge("Civil Lines","Vidhan Sabha"));//Civil Lines
            graph.add(new Edge("Civil Lines","Kashmere Gate"));

            graph.add(new Edge("Kashmere Gate","Civil Lines"));//Kashmere Gate
            graph.add(new Edge("Kashmere Gate","Chandini Chowk"));

            graph.add(new Edge("Chandini Chowk","Kashmere Gate"));//Chandini Chowk
            graph.add(new Edge("Chandini Chowk","Chawri Bazar"));

            graph.add(new Edge("Chawri Bazar","New Delhi"));//Chawri Bazar
            graph.add(new Edge("Chawri Bazar","Chandini Chowk"));

            graph.add(new Edge("New Delhi","Chawri Bazar"));//New Delhi
            graph.add(new Edge("New Delhi","Rajiv Chowk"));

            graph.add(new Edge("Rajiv Chowk","New Delhi"));//Rajiv Chowk
            graph.add(new Edge("Rajiv Chowk","Patel Chowk"));

            graph.add(new Edge("Patel Chowk","Rajiv Chowk"));//Patel Chowk
            graph.add(new Edge("Patel Chowk","Central Secratariat"));

            graph.add(new Edge("Central Secratariat","Patel Chowk"));//Central Secratariat
            graph.add(new Edge("Central Secratariat","Udyog Bhawan"));

            graph.add(new Edge("Udyog Bhawan","Central Secratariat"));//Udyog Bhawan
            graph.add(new Edge("Udyog Bhawan","Lok Kalyan Marg"));

            graph.add(new Edge("Lok Kalyan Marg","Udyog Bhawan"));//Lok Kalyan Marg
            graph.add(new Edge("Lok Kalyan Marg","Jor Bagh"));

            graph.add(new Edge("Jor Bagh","Lok Kalyan Marg"));//Jor Bagh
            graph.add(new Edge("Jor Bagh","Delhi Haat-INA"));

            graph.add(new Edge("Delhi Haat-INA","Jor Bagh"));//Delhi Haat-INA
            graph.add(new Edge("Delhi Haat-INA","AIMS"));

            graph.add(new Edge("AIMS","Delhi Haat-INA"));//AIMS
            graph.add(new Edge("AIMS","Green Park"));

            graph.add(new Edge("Green Park","AIMS"));//Green Park
            graph.add(new Edge("Green Park","Hauz Khas"));

            graph.add(new Edge("Hauz Khas","Green Park"));//Hauz Khas
            graph.add(new Edge("Hauz Khas","Malviya Nagar"));
            
            graph.add(new Edge("Malviya Nagar","Hauz Khas"));//Malviya Nagar
            graph.add(new Edge("Malviya Nagar","Saket"));
            
            graph.add(new Edge("Saket","Malviya Nagar"));//Saket
            graph.add(new Edge("Saket","Qutab Minar"));

            graph.add(new Edge("Qutab Minar","Saket"));//Qutab Minar
            graph.add(new Edge("Qutab Minar","Chhatarpur"));

            graph.add(new Edge("Chhatarpur","Qutab Minar"));//Chhatarpur
            graph.add(new Edge("Chhatarpur","Sultanpur"));

            graph.add(new Edge("Sultanpur","Chhatarpur"));//Sultanpur
            graph.add(new Edge("Sultanpur","Ghitorni"));

            graph.add(new Edge("Ghitorni","Sultanpur"));//Ghitorni
            graph.add(new Edge("Ghitorni","Arjan Garh"));

            graph.add(new Edge("Arjan Garh","Ghitorni"));//Arjan Garh
            graph.add(new Edge("Arjan Garh","Guru Dronacharya"));

            graph.add(new Edge("Guru Dronacharya","Arjan Garh"));//Guru Dronacharya
            graph.add(new Edge("Guru Dronacharya","Sikanderpur"));

            graph.add(new Edge("Sikanderpur","Guru Dronacharya"));//Sikanderpur
            graph.add(new Edge("Sikanderpur","M.G. Road"));

            graph.add(new Edge("M.G. Road","Sikanderpur"));//M.G. Road
            graph.add(new Edge("M.G. Road","IFFCO Chowk"));

            graph.add(new Edge("IFFCO Chowk","M.G. Road"));//IFFCO Chowk
            graph.add(new Edge("IFFCO Chowk","Millenium City Centre Gurugram"));

            graph.add(new Edge("Millenium City Centre Gurugram","IFFCO Chowk"));//Millenium City Centre Gurugram

            //Magenta Line
            graph.add(new Edge("Janakpuri West","Dabri Mor-Janakpuri South"));//Janakpuri West

            graph.add(new Edge("Dabri Mor-Janakpuri South","Janakpuri West"));//Dabri Mor-Janakpuri South
            graph.add(new Edge("Dabri Mor-Janakpuri South","Dashrathpuri"));

            graph.add(new Edge("Dashrathpuri","Dabri Mor-Janakpuri South"));//Dashrathpuri
            graph.add(new Edge("Dashrathpuri","Palam"));

            graph.add(new Edge("Palam","Dashrathpuri"));//Palam
            graph.add(new Edge("Palam","Sadar Bazar Cantonment"));

            graph.add(new Edge("Sadar Bazar Cantonment","Palam"));//Sadar Bazar Cantonment
            graph.add(new Edge("Sadar Bazar Cantonment","Terminal 1 IGI Airport"));

            graph.add(new Edge("Terminal 1 IGI Airport","Sadar Bazar Cantonment"));//Terminal 1 IGI Airport
            graph.add(new Edge("Terminal 1 IGI Airport","Shankar Vihar"));

            graph.add(new Edge("Shankar Vihar","Terminal 1 IGI Airport"));//Shankar Vihar
            graph.add(new Edge("Shankar Vihar","Vasant Vihar"));

            graph.add(new Edge("Vasant Vihar","Shankar Vihar"));//Vasant Vihar
            graph.add(new Edge("Vasant Vihar","Munirka"));
            
            graph.add(new Edge("Munirka","Vasant Vihar"));//Munirka
            graph.add(new Edge("Munirka","R.K. Puram"));

            graph.add(new Edge("R.K. Puram","Munirka"));//R.K. Puram
            graph.add(new Edge("R.K. Puram","IIT"));

            graph.add(new Edge("IIT","R.K. Puram"));//IIT
            graph.add(new Edge("IIT","Hauz Khas"));

            graph.add(new Edge("Hauz Khas","IIT"));//Hauz Khas
            graph.add(new Edge("Hauz Khas","Panchsheel Park"));

            graph.add(new Edge("Panchsheel Park","Hauz Khas"));//Panchsheel Park
            graph.add(new Edge("Panchsheel Park","Chirag Delhi"));

            graph.add(new Edge("Chirag Delhi","Panchsheel Park"));//Chirag Delhi
            graph.add(new Edge("Chirag Delhi","Greater Kailash"));

            graph.add(new Edge("Greater Kailash","Chirag Delhi"));//Greater Kailash
            graph.add(new Edge("Greater Kailash","Nehru Enclave"));

            graph.add(new Edge("Nehru Enclave","Greater Kailash"));//Nehru Enclave
            graph.add(new Edge("Nehru Enclave","Kalkaji Mandir"));

            graph.add(new Edge("Kalkaji Mandir","Nehru Enclave"));//Kalkaji Mandir
            graph.add(new Edge("Kalkaji Mandir","Okhla NSIC"));

            graph.add(new Edge("Okhla NSIC","Sukhdev Vihar"));//Okhla NSIC
            graph.add(new Edge("Okhla NSIC","Kalkaji Mandir"));

            graph.add(new Edge("Sukhdev Vihar","Okhla NSIC"));//Sukhdev Vihar
            graph.add(new Edge("Sukhdev Vihar","Jamia Millia Islamia"));

            graph.add(new Edge("Jamia Millia Islamia","Sukhdev Vihar"));//Jamia Millia Islamia
            graph.add(new Edge("Jamia Millia Islamia","Okhla Vihar"));

            graph.add(new Edge("Okhla Vihar","Jamia Millia Islamia"));//Okhla Vihar
            graph.add(new Edge("Okhla Vihar","Jasola Vihar Shaheen Bagh"));

            graph.add(new Edge("Jasola Vihar Shaheen Bagh","Okhla Vihar"));//Jasola Vihar Shaheen Bagh
            graph.add(new Edge("Jasola Vihar Shaheen Bagh","Kalindi Kunj"));

            graph.add(new Edge("Kalindi Kunj","Jasola Vihar Shaheen Bagh"));//Kalindi Kunj
            graph.add(new Edge("Kalindi Kunj","Okhla Bird Sanctuary"));

            graph.add(new Edge("Okhla Bird Sanctuary","Kalindi Kunj"));//Okhla Bird Sanctuary
            graph.add(new Edge("Okhla Bird Sanctuary","Botanical Garden"));

            graph.add(new Edge("Botanical Garden","Okhla Bird Sanctuary"));//Botanical Garden

            //Pink Line
            graph.add(new Edge("Shiv Vihar","Johri Enclave"));//Shiv Vihar

            graph.add(new Edge("Johri Enclave","Shiv Vihar"));//Johri Enclave
            graph.add(new Edge("Johri Enclave","Gokulpuri"));

            graph.add(new Edge("Gokulpuri","Johri Enclave"));//Gokulpuri
            graph.add(new Edge("Gokulpuri","Maujpur-Babarpur"));

            graph.add(new Edge("Maujpur-Babarpur","Gokulpuri"));//Maujpur-Babarpur
            graph.add(new Edge("Maujpur-Babarpur","Jafrabad"));

            graph.add(new Edge("Jafrabad","Maujpur-Babarpur"));//Jafrabad
            graph.add(new Edge("Jafrabad","Welcome"));

            graph.add(new Edge("Welcome","Jafrabad"));//Welcome
            graph.add(new Edge("Welcome","East Azad Nagar"));

            graph.add(new Edge("East Azad Nagar","Welcome"));//East Azad Nagar
            graph.add(new Edge("East Azad Nagar","Krishna Nagar"));

            graph.add(new Edge("Krishna Nagar","East Azad Nagar"));//Krishna Nagar
            graph.add(new Edge("Krishna Nagar","Karkardooma Court"));

            graph.add(new Edge("Karkardooma Court","Krishna Nagar"));//Karkardooma Court
            graph.add(new Edge("Karkardooma Court","Karkardooma"));

            graph.add(new Edge("Karkardooma","Karkardooma Court"));//Karkardooma
            graph.add(new Edge("Karkardooma","Anand Vihar"));

            graph.add(new Edge("Anand Vihar","Karkardooma"));//Anand Vihar
            graph.add(new Edge("Anand Vihar","I.P. Extension"));

            graph.add(new Edge("I.P. Extension","Anand Vihar"));//I.P. Extension
            graph.add(new Edge("I.P. Extension","Mandawli-West Vinod Nagar"));

            graph.add(new Edge("Mandawli-West Vinod Nagar","I.P. Extension"));//Mandawli-West Vinod Nagar
            graph.add(new Edge("Mandawli-West Vinod Nagar","East Vinod Nagar-Mayur Vihar 2"));

            graph.add(new Edge("East Vinod Nagar-Mayur Vihar 2","Mandawli-West Vinod Nagar"));//East Vinod Nagar-Mayur Vihar 2
            graph.add(new Edge("East Vinod Nagar-Mayur Vihar 2","Trilokpuri-Sanjay Lake"));

            graph.add(new Edge("Trilokpuri-Sanjay Lake","East Vinod Nagar-Mayur Vihar 2"));//Trilokpuri-Sanjay Lake
            graph.add(new Edge("Trilokpuri-Sanjay Lake","Mayur Vihar Pocket-1"));

            graph.add(new Edge("Mayur Vihar Pocket-1","Trilokpuri-Sanjay Lake"));//Mayur Vihar Pocket-1
            graph.add(new Edge("Mayur Vihar Pocket-1","Mayur Vihar-1"));

            graph.add(new Edge("Mayur Vihar-1","Mayur Vihar Pocket-1"));//Mayur Vihar-1
            graph.add(new Edge("Mayur Vihar-1","Sarai Kale Khan-Nizamuddin"));

            graph.add(new Edge("Sarai Kale Khan-Nizamuddin","Mayur Vihar-1"));//Sarai Kale Khan-Nizamuddin
            graph.add(new Edge("Sarai Kale Khan-Nizamuddin","Ashram"));

            graph.add(new Edge("Ashram","Sarai Kale Khan-Nizamuddin"));//Ashram
            graph.add(new Edge("Ashram","Vinobapuri"));

            graph.add(new Edge("Vinobapuri","Ashram"));//Vinobapuri
            graph.add(new Edge("Vinobapuri","Lajpat Nagar"));

            graph.add(new Edge("Lajpat Nagar","Vinobapuri"));//Lajpat Nagar
            graph.add(new Edge("Lajpat Nagar","South Extension"));

            graph.add(new Edge("South Extension","Lajpat Nagar"));//South Extension
            graph.add(new Edge("South Extension","Delhi Haat-INA"));

            graph.add(new Edge("Delhi Haat-INA","South Extension"));//Delhi Haat-INA
            graph.add(new Edge("Delhi Haat-INA","Sarojini Nagar"));

            graph.add(new Edge("Sarojini Nagar","Delhi Haat-INA"));//Sarojini Nagar
            graph.add(new Edge("Sarojini Nagar","Bikaji Cama Place"));

            graph.add(new Edge("Bikaji Cama Place","Sarojini Nagar"));//Bikaji Cama Place
            graph.add(new Edge("Bikaji Cama Place","Sir M. Visweshwaraiah Moti Bagh"));

            graph.add(new Edge("Sir M. Visweshwaraiah Moti Bagh","Bikaji Cama Place"));//Sir M. Visweshwaraiah Moti Bagh
            graph.add(new Edge("Sir M. Visweshwaraiah Moti Bagh","Durgabai DeshMukh South Campus"));

            graph.add(new Edge("Durgabai DeshMukh South Campus","Sir M. Visweshwaraiah Moti Bagh"));//Durgabai DeshMukh South Campus
            graph.add(new Edge("Durgabai DeshMukh South Campus","Delhi Cantt"));
            graph.add(new Edge("Durgabai DeshMukh South Campus","Dhaula Kuan"));

            graph.add(new Edge("Delhi Cantt","Durgabai DeshMukh South Campus"));//Delhi Cantt
            graph.add(new Edge("Delhi Cantt","Nariana Vihar"));

            graph.add(new Edge("Nariana Vihar","Delhi Cantt"));//Nariana Vihar
            graph.add(new Edge("Nariana Vihar","Mayapuri"));

            graph.add(new Edge("Mayapuri","Nariana Vihar"));//Mayapuri
            graph.add(new Edge("Mayapuri","Rajouri Garden"));

            graph.add(new Edge("Rajouri Garden","Mayapuri"));//Rajouri Garden
            graph.add(new Edge("Rajouri Garden","ESI-Basaidarapur"));

            graph.add(new Edge("ESI-Basaidarapur","Rajouri Garden"));//ESI-Basaidarapur
            graph.add(new Edge("ESI-Basaidarapur","Punjabi Bagh West"));

            graph.add(new Edge("Punjabi Bagh West","ESI-Basaidarapur"));//Punjabi Bagh West
            graph.add(new Edge("Punjabi Bagh West","Shakurpur"));

            graph.add(new Edge("Shakurpur","Punjabi Bagh West"));//Shakurpur
            graph.add(new Edge("Shakurpur","Netaji Subhash Place"));

            graph.add(new Edge("Netaji Subhash Place","Shakurpur"));//Netaji Subhash Place
            graph.add(new Edge("Netaji Subhash Place","Shalimar Bagh"));
            
            graph.add(new Edge("Shalimar Bagh","Netaji Subhash Place"));//Shalimar Bagh
            graph.add(new Edge("Shalimar Bagh","Azadpur"));
        
            graph.add(new Edge("Azadpur","Shalimar Bagh"));//Azadpur
            graph.add(new Edge("Azadpur","Majlis Park"));

            graph.add(new Edge("Majlis Park","Azadpur"));//Majlis Park

            //Gurgaon Rapid Metro
            graph.add(new Edge("Sikanderpur","Phase-1"));//Sikanderpur
            graph.add(new Edge("Sikanderpur","Phase-2"));

            graph.add(new Edge("Phase-2","Sikanderpur"));//Phase-2
            graph.add(new Edge("Phase-2","Phase-3"));
            graph.add(new Edge("Phase-2","Bilvedere Towers"));

            graph.add(new Edge("Bilvedere Towers","Phase-2"));//Bilvedere Towers
            graph.add(new Edge("Bilvedere Towers","Cyber City"));

            graph.add(new Edge("Cyber City","Bilvedere Towers"));//Cyber City
            graph.add(new Edge("Cyber City","Moulsari Avenue"));

            graph.add(new Edge("Moulsari Avenue","Cyber City"));//Moulsari Avenue
            graph.add(new Edge("Moulsari Avenue","Phase-3"));

            graph.add(new Edge("Phase-3","Moulsari Avenue"));//Phase-3
            graph.add(new Edge("Phase-3","Phase-2"));

            graph.add(new Edge("Phase-1","Sikanderpur"));//Phase-1
            graph.add(new Edge("Phase-1","Sector-42,43"));

            graph.add(new Edge("Sector-42,43","Phase-1"));//Sector-42,43
            graph.add(new Edge("Sector-42,43","Sector-53,54"));

            graph.add(new Edge("Sector-53,54","Sector-54 Chowk"));//Sector-53,54
            graph.add(new Edge("Sector-53,54","Sector-42,43"));

            graph.add(new Edge("Sector-54 Chowk","Sector-53,54"));//Sector-54 Chowk
            graph.add(new Edge("Sector-54 Chowk","Sector-55-56"));

            graph.add(new Edge("Sector-55-56","Sector-54 Chowk"));//Sector-55-56

            //Aqua Line
            graph.add(new Edge("Sector-51","Sector-52 Noida"));//Sector-51
            graph.add(new Edge("Sector-51","Sector-50"));

            graph.add(new Edge("Sector-50","Sector-51"));//Sector-50
            graph.add(new Edge("Sector-50","Sector-76"));

            graph.add(new Edge("Sector-76","Sector-101"));//Sector-76
            graph.add(new Edge("Sector-76","Sector-50"));

            graph.add(new Edge("Sector-101","Sector-76"));//Sector-101
            graph.add(new Edge("Sector-101","Sector-81"));

            graph.add(new Edge("Sector-81","Sector-101"));//Sector-81
            graph.add(new Edge("Sector-81","N.S.E.Z."));

            graph.add(new Edge("N.S.E.Z.","Sector-81"));//N.S.E.Z.
            graph.add(new Edge("N.S.E.Z.","Sector-83"));

            graph.add(new Edge("Sector-83","N.S.E.Z."));//Sector-83
            graph.add(new Edge("Sector-83","Sector-137"));

            graph.add(new Edge("Sector-137","Sector-83"));//Sector-137
            graph.add(new Edge("Sector-137","Sector-142"));

            graph.add(new Edge("Sector-142","Sector-137"));//Sector-142
            graph.add(new Edge("Sector-142","Sector-143"));

            graph.add(new Edge("Sector-143","Sector-142"));//Sector-143
            graph.add(new Edge("Sector-143","Sector-144"));

            graph.add(new Edge("Sector-144","Sector-143"));//Sector-144
            graph.add(new Edge("Sector-144","Sector-145"));

            graph.add(new Edge("Sector-145","Sector-144"));//Sector-145
            graph.add(new Edge("Sector-145","Sector-146"));

            graph.add(new Edge("Sector-146","Sector-145"));//Sector-146
            graph.add(new Edge("Sector-146","Sector-147"));

            graph.add(new Edge("Sector-147","Sector-146"));//Sector-147
            graph.add(new Edge("Sector-147","Sector-148"));

            graph.add(new Edge("Sector-148","Sector-147"));//Sector-148
            graph.add(new Edge("Sector-148","Knowledge Park2"));

            graph.add(new Edge("Knowledge Park 2","Sector-148"));//Knowledge Park 2
            graph.add(new Edge("Knowledge Park 2","Pari Chowk"));

            graph.add(new Edge("Pari Chowk","Knowledge Park 2"));//Pari Chowk
            graph.add(new Edge("Pari Chowk","Alpha-1"));

            graph.add(new Edge("Alpha-1","Pari Chowk"));//Alpha-1
            graph.add(new Edge("Alpha-1","Delta-1"));

            graph.add(new Edge("Delta-1","Alpha-1"));//Delta-1
            graph.add(new Edge("Delta-1","Greater Noida Office"));

            graph.add(new Edge("Greater Noida Office","Delta-1"));//Greater Noida Office
            graph.add(new Edge("Greater Noida Office","Depot Station"));
            
            graph.add(new Edge("Depot Station","Greater Noida Office"));//Depot Station
        }

         // Dijkstra's Algorithm to find the shortest path
         public static Map<String, Integer> dijkstra(String src, Map<String, String> previous) {
            // Min-heap priority queue
            PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(n -> n.distance));
            Map<String, Integer> distances = new HashMap<>(); // Stores the shortest distance to each station

            // Initialize distances to infinity and previous station to null
            for (Edge edge : graph) {
                distances.put(edge.src, Integer.MAX_VALUE);
                distances.put(edge.dest, Integer.MAX_VALUE);
                previous.put(edge.src, null);
                previous.put(edge.dest, null);
            }

            // Set the distance to the source to 0 and add it to the priority queue
            distances.put(src, 0);
            pq.add(new Node(src, 0));

            while (!pq.isEmpty()) {
                // Get the node with the smallest distance
                Node currentNode = pq.poll();
                String currentStation = currentNode.station;

                // Explore all the neighbors of the current station
                for (Edge edge : graph) {
                    if (edge.src.equals(currentStation)) {
                        String neighbor = edge.dest;
                        int newDist = distances.get(currentStation) + 1; // All edges have weight = 1

                        // If the new distance is shorter, update the distance and add to the priority queue
                        if (newDist < distances.get(neighbor)) {
                            distances.put(neighbor, newDist);
                            previous.put(neighbor, currentStation);
                            pq.add(new Node(neighbor, newDist));
                        }
                    }
                }
            }

            return distances;
        }

        // Reconstruct the shortest path from source to destination
        public static List<String> getPath(Map<String, String> previous, String dest) {
            List<String> path = new ArrayList<>();
            for (String at = dest; at != null; at = previous.get(at)) {
                path.add(at);
            }
            Collections.reverse(path);
            return path;
        }

        // Node class for Dijkstra's algorithm priority queue
        static class Node {
            String station;
            int distance;

            public Node(String station, int distance) {
                this.station = station;
                this.distance = distance;
            }
        }
    }
}
