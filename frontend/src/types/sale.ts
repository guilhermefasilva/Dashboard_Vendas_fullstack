import { Saller } from "./saller"

export type Sale ={
  id: number;
  visited: number;
  deals: number;
  amount: number;
  date: string;
  sallerDto: Saller;
}

export type SalePage={
  content?: Sale[];
    last: boolean;
    totalPages: number;
    totalElements: number;
    first: boolean ;
    number: number;
    numberOfElements?: number;
    size?: number;
    empty?: boolean; 
}

export type SaleSum ={
  salleName: string;
  sum: number;
}

export type SaleSuccess ={
  salleName: string;
  visited: number;
  deals: number;
}