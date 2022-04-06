# Assembler-Disassembler

This is an app for  Assemble  and Disassemble in mips.

This program can detect R-type, I-type and J-type or giving it a mips command and gives to you 32bit binary in each format if types:

 R-type:  
 --
 ![R-type](https://github.com/nawidadkhah/Assembler-Disassembler/blob/main/images/R-type.jpg?raw=true)

 I-type: 
 --
 ![I-type](https://github.com/nawidadkhah/Assembler-Disassembler/blob/main/images/I-type.jpg?raw=true)
 
 J-type:
 --
 ![J-type](https://github.com/nawidadkhah/Assembler-Disassembler/blob/main/images/J-type.jpg?raw=true)
 
 The program input for assembler is as follows:
 --
 
 <details>
           <summary>  sll $t0 $s0 2 </summary>
           <p>
0x00104080  
            
R-Type           
op: 000000     
rs: 00000         
rt: 10000          
rd: 01000        
shamt: 00010           
funct: 000000</p>
 </details>
 
  <details>
           <summary>  lw $t0 0x0060 $t2 </summary>
           <p> 
  0x8D480060
            
 I-Type       
 op: 100011        
 rs: 01010            
 rt: 01000             
 constant or address: 0000000001100000  
           </p>
 </details>
 
   <details>
           <summary>  j 0x1000 </summary>
           <p> 
 0x08001000
            
 J-Type     
 op: 000010              
 address: 00000000000001000000000000
</p>
 </details>
 
 The program input for disassembler is as follows:
 --
 
 <details>
           <summary> 0x02C84020 </summary>
           <p>
add $t0, $s0, 2  
            
R-Type  
op: 000000  
rs: 10110  
rt: 01000  
rd: 01000  
shamt: 00000  
funct: 100000</p>
 </details>
 
  <details>
           <summary>  0x8D480060 </summary>
           <p> 
lw $t0, 0x0060, $t2
            
I-Type  
op: 100011  
rs: 01010  
rt: 01000  
constant or address: 0000000001100000
           </p>
 </details>
 
   <details>
           <summary>  0x08001000 </summary>
           <p> 
j 0x1000
            
J-Type  
op: 000010  
address: 00000000000001000000000000  
</p>
 </details>

